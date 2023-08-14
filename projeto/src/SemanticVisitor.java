import java.util.HashMap;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@SuppressWarnings("CheckReturnValue")
public class SemanticVisitor extends DimanaBaseVisitor<Boolean> {
   HashMap<String, List<String>> dimension_map = new HashMap<String, List<String>>(); // guardar dimensões
   HashMap<String, String> variables = new HashMap<String, String>(); // guardar variaveis
   List<String> palavras_reservadas = Arrays.asList("integer", "real", "string", "list", "read", "write", "writeln",
         "use", "prefix", "dimension", "unit", "for", "to", "end", "new", "break");
   // palavras que não se podem utilizar uma vez que são reservadas

   @Override
   public Boolean visitProgram(DimanaParser.ProgramContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);

   }

   @Override
   public Boolean visitStat(DimanaParser.StatContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitList_append(DimanaParser.List_appendContext ctx) {
      Boolean res = null;
      String lista = ctx.ID().getText();
      String tipo = variables.get(lista);
      tipo = tipo.substring(0, tipo.indexOf("["));

      String dimensao = variables.get(lista);
      dimensao = dimensao.substring(dimensao.indexOf("[") + 1, dimensao.indexOf("]"));
      // Vai buscar o segundo item dimensao da lista das dimensions

      List<String> dimensao_lista = dimension_map.get(dimensao);
      String dimensao2;
      if (dimensao_lista == null) {
         dimensao2 = dimensao;
      } else {
         dimensao2 = dimensao_lista.get(1);
      }

      // Verifica se a lista existe nas variaveis
      if (variables.containsKey(lista)) {
         if (tipo.equals("list")) {
         } else {
            ErrorHandling.printError(ctx, "A variável " + lista + " não é uma lista");
            return false;
         }
      } else {
         ErrorHandling.printError(ctx, "A variável " + lista + "não existe");
         return false;
      }

      String expressao = ctx.expression().getText();

      if (expressao.startsWith("read", 0)) {
      } else {
         // integer(read"NMEC: ")*nmec Guarda apenas o integer
         String tipo_inicial = expressao.substring(0, expressao.indexOf("("));
         if (tipo_inicial.equals(dimensao2)) {
         } else {
            ErrorHandling.printError(ctx, "Tentar guardar um tipo diferente do tipo da lista " + dimensao2);
            return false;
         }
      }
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitRead(DimanaParser.ReadContext ctx) {
      String expressao = ctx.expression().getText();
      boolean hasValidFormat = (expressao.startsWith("\"") && expressao.endsWith("\""))
            || (expressao.startsWith("'") && expressao.endsWith("'"));
      if (hasValidFormat == true) {
         return visitChildren(ctx);
      } else {
         ErrorHandling.printError(ctx, "A expressão deve estar entre aspas");
         return false;
      }
   }

   @Override
   public Boolean visitWrite(DimanaParser.WriteContext ctx) {
      Boolean res = null;
      String expressao = ctx.expression().getText();
      String tipo = expressao.substring(0, expressao.indexOf("("));
      String dentro = expressao.substring(expressao.indexOf("(") + 1, expressao.indexOf(")"));
      // Divide o dentro pela virgula e salva o que está antes da virgula
      String[] partes = dentro.split(",");
      String print = partes[0];
      String caracteres = partes[1];
      // verifica se caracteres é inteiro, se nao for dá return false
      try {
         Integer.parseInt(caracteres);
      } catch (NumberFormatException e) {
         return false;
      }

      return visitChildren(ctx);
   }

   @Override
   public Boolean visitWriteln(DimanaParser.WritelnContext ctx) {
      String expressao1 = ctx.expression().getText();
      if (!expressao1.startsWith("\"")) {
         String tipo1 = expressao1.substring(0, expressao1.indexOf("("));
         String dentro1 = expressao1.substring(expressao1.indexOf("(") + 1, expressao1.indexOf(")"));

         // Divide o dentro pela virgula e salva o que está antes da virgula
         String[] partes1 = dentro1.split(",");
         String print1 = partes1[0];
         String caracteres1 = partes1[1];
         // verifica se caracteres é inteiro, se nao for dá return false
         try {
            Integer.parseInt(caracteres1);
         } catch (NumberFormatException e) {
            ErrorHandling.printError(ctx, "O numero de caracteres a serem impressos deve ser um inteiro");
            return false;
         }
      } // return res;
      return visitChildren(ctx);
   }

   @Override
   public Boolean visitUse(DimanaParser.UseContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitPrefix(DimanaParser.PrefixContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitDimensionDef(DimanaParser.DimensionDefContext ctx) {
      // verificar se o dimensionDef é feito com assignament ou expression
      if (ctx.expression() != null) {
         String x = ctx.expression().getText(); // ir buscar a expressão
         x = x.replace("]", ""); // retirar os parantesis retos finais e separar pelos iniciais
         String[] st1 = x.split("\\[");
         String st2 = ctx.type().getText(); // ir buscar o tipo da dimensão que se pretende definir
         if (!dimension_map.containsKey(st1[0]) && !st2.contains("string") && !palavras_reservadas.contains(st1)) { // como
                                                                                                                    // a
                                                                                                                    // dimensão
                                                                                                                    // não
                                                                                                                    // pode
                                                                                                                    // ser
                                                                                                                    // uma
                                                                                                                    // string,
                                                                                                                    // verificamos
                                                                                                                    // se
                                                                                                                    // não
                                                                                                                    // é,
                                                                                                                    // se
                                                                                                                    // não
                                                                                                                    // é
                                                                                                                    // uma
                                                                                                                    // das
                                                                                                                    // palavras
                                                                                                                    // reservadas
                                                                                                                    // e
                                                                                                                    // se
                                                                                                                    // já
                                                                                                                    // não
                                                                                                                    // foi
                                                                                                                    // inicializada
            List<String> val_to_varmap = new ArrayList<String>(); // utiizado em auxílio para fazer a inserção dentro do
                                                                  // hashmap das dimensões
            if ((st1[1].split(",")).length > 1) {
               st1[1] = st1[1].split(",")[0];
            }
            val_to_varmap.add(st1[1]);
            val_to_varmap.add(st2);
            dimension_map.put(st1[0], val_to_varmap);
            return visitChildren(ctx);
         } else {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Já existe uma dimensão com este nome!");
            return false;
         }
      } else {
         // se for um assignament
         String ass = ctx.assignament().getText();

         String[] first_part = ass.split("\\s*=\\s*");
         String depedant = first_part[0];
         String type_dependant = ctx.type().getText();

         String[] result_parts = first_part[1].replaceAll(";$", "").split("\\s*[-+*/]\\s*");

         boolean can_enter = true;

         ArrayList<Boolean> what_op = new ArrayList<>();
         what_op = what_operation(first_part[1]);

         for (String result : result_parts) {
            if (!dimension_map.containsKey(result)) {
               can_enter = false;
            }
         }

         if (can_enter) {
            boolean has_real = false;
            for (String string : result_parts) {
               if (dimension_map.get(string).get(1).contains("real")) {
                  has_real = true;
               }
            }
            if (!dimension_map.containsKey(depedant) && !type_dependant.contains("string")) {
               if (has_real) {
                  // always real in this situations
                  if (type_dependant.contains("real")) {
                     List<String> dim_to_varmap = new ArrayList<String>();
                     String regex = String.join("|", dimension_map.keySet());

                     Pattern pattern = Pattern.compile(regex);
                     Matcher matcher = pattern.matcher(first_part[1].replaceAll(";$", ""));

                     StringBuffer output = new StringBuffer();

                     while (matcher.find()) {
                        String name = matcher.group();
                        String suffix = dimension_map.get(name).get(0);
                        matcher.appendReplacement(output, suffix);
                     }

                     matcher.appendTail(output);

                     String result = output.toString();

                     dim_to_varmap.add(result);
                     dim_to_varmap.add(type_dependant);
                     dimension_map.put(depedant, dim_to_varmap);
                     return true;

                  } else {
                     ErrorHandling.printError(ctx,
                           "ERRO SEMÂNTICO : O Tipo da variável que deseja criar não corresponde ao tipo dado!");
                     return false;
                  }
               } else {
                  if (what_op.get(3) == true) {
                     if (type_dependant.contains("real")) {
                        List<String> dim_to_varmap = new ArrayList<String>();
                        String regex = String.join("|", dimension_map.keySet());

                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(first_part[1].replaceAll(";$", ""));

                        StringBuffer output = new StringBuffer();

                        while (matcher.find()) {
                           String name = matcher.group();
                           String suffix = dimension_map.get(name).get(0);
                           matcher.appendReplacement(output, suffix);
                        }

                        matcher.appendTail(output);

                        String result = output.toString();

                        dim_to_varmap.add(result);
                        dim_to_varmap.add(type_dependant);
                        dimension_map.put(depedant, dim_to_varmap);
                        return true;

                     } else {
                        ErrorHandling.printError(ctx,
                              "ERRO SEMÂNTICO : O Tipo da variável que deseja criar não corresponde ao tipo dado!");
                        return false;
                     }
                  } else {
                     if (type_dependant.contains("integer") || type_dependant.contains("real")) {
                        List<String> dim_to_varmap = new ArrayList<String>();

                        String regex = String.join("|", dimension_map.keySet());

                        Pattern pattern = Pattern.compile(regex);
                        Matcher matcher = pattern.matcher(first_part[1].replaceAll(";$", ""));

                        StringBuffer output = new StringBuffer();

                        while (matcher.find()) {
                           String name = matcher.group();
                           String suffix = dimension_map.get(name).get(0);
                           matcher.appendReplacement(output, suffix);
                        }

                        matcher.appendTail(output);

                        String result = output.toString();

                        dim_to_varmap.add(result);
                        dim_to_varmap.add(type_dependant);
                        dimension_map.put(depedant, dim_to_varmap);
                        return true;
                     } else {
                        ErrorHandling.printError(ctx,
                              "ERRO SEMÂNTICO : O Tipo da variável que deseja criar não corresponde ao tipo dado!");
                        return false;
                     }
                  }
               }

            } else {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Uma variável com este nome já foi inicializada!");
               return false;
            }
         } else {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variaveis não inicializadas!");
            return false;
         }
      }

   }

   // return res;

   public static ArrayList<Boolean> what_operation(String s) {
      boolean hasAddition = s.contains("+");
      boolean hasSubtraction = s.contains("-");
      boolean hasMultiplication = s.contains("*");
      boolean hasDivision = s.contains("/");
      ArrayList<Boolean> res = new ArrayList<Boolean>();

      if (hasAddition) {
         res.add(true);
      } else {
         res.add(false);
      }

      if (hasSubtraction) {
         res.add(true);
      } else {
         res.add(false);
      }

      if (hasMultiplication) {
         res.add(true);
      } else {
         res.add(false);
      }

      if (hasDivision) {
         res.add(true);
      } else {
         res.add(false);
      }

      return res;

   }

   @Override
   public Boolean visitUnitDef(DimanaParser.UnitDefContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitVarInicialization(DimanaParser.VarInicializationContext ctx) {
      String x = ctx.type().getText();
      String z = ctx.ID().getText();
      List<String> val_to_map = new ArrayList<>();
      val_to_map.add(x);
      if (!palavras_reservadas.contains(z)) {
         if (ctx.init() == null) {
            if (dimension_map.containsKey(x) && !variables.containsKey(z)) {
               variables.put(z, x);
               return true;
            } else if (!variables.containsKey(z)
                  && (x.contains("string") || x.contains("integer") || x.contains("real") || x.contains("list"))) {
               variables.put(z, x);
               return true;
            } else {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Uma variável com este nome já foi inicializada!");
               return false;
            }
         }

         else {
            String t = ctx.init().expression().getText();
            boolean is_correct = false;
            if ((x.contains("list"))) {
               is_correct = (("new" + x).equals(t));
            } else if (x.contains("integer")) {
               is_correct = isInt(t);
            } else if (x.contains("real")) {
               is_correct = isReal(t);
            } else if (x.contains("string")) {
               is_correct = t.matches("\".*?\"");

            } else {
               is_correct = (t.contains("*" + dimension_map.get(x).get(0)));

               String[] substrings = t.split("\\s*((?<=[-+*/])|(?=[-+*/]))\\s*");
               List<String> substringList = Arrays.asList(substrings);

               String r = "";
               for (String it : substringList) {

                  String dim = (variables.get(it));
                  if (dimension_map.containsKey(dim)) {
                     r = r + dimension_map.get(dim).get(0);
                  } else {
                     r = r + it;
                  }
               }

               is_correct = is_correct || (r.equals(dimension_map.get(x).get(0)));
            }

            if (!dimension_map.containsKey(z)
                  && !(x.contains("string") || x.contains("integer") || x.contains("real") || x.contains("list"))) {
               if (is_correct) {
                  dimension_map.put(z, val_to_map);
                  return true;
               } else {
                  ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Inicialização incorreta!");
                  return false;
               }
            } else if (!variables.containsKey(z) && x.contains("string") || x.contains("integer") || x.contains("real")
                  || x.contains("list")) {
               if (is_correct) {
                  variables.put(z, x);
                  return true;
               } else {
                  ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Inicialização incorreta!");
                  return false;
               }
            } else {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Uma variável com este nome já foi inicializada!");
               return false;
            }

         }
      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : " + z + " é uma palavra reservada!");
         return false;
      }
      // return res;
   }

   public static boolean isInt(String string) {
      int intValue;

      if (string == null || string.equals("")) {
         return false;
      }

      try {
         intValue = Integer.parseInt(string);
         return true;
      } catch (NumberFormatException e) {
      }
      return false;
   }

   public static boolean isReal(String string) {
      double doubleValue;

      if (string == null || string.equals("")) {
         return false;
      }

      try {
         doubleValue = Double.parseDouble(string);
         return true;
      } catch (NumberFormatException e) {
      }
      return false;
   }

   @Override
   public Boolean visitAssignament(DimanaParser.AssignamentContext ctx) {

      String all = ctx.getText();
      String id = ctx.ID().getText();

      List<String> dimensao_lista = dimension_map.get(variables.get(id));
      String dimensao2;
      if (dimensao_lista == null) {
         dimensao2 = variables.get(id);
      } else {
         dimensao2 = dimensao_lista.get(1);
      }

      if (variables.containsKey(id)) {
         String init = ctx.init().getText().replaceAll(";$", "").replace("=", "");
         ;

         Boolean is_cor = false;
         String type = variables.get(id);

         if (init.startsWith("read", 0)) {
            return visitChildren(ctx);
         } else {
            // integer(read"NMEC: ")*nmec Guarda apenas o integer
            if (init.contains("(")) {
               String tipo_inicial = init.substring(0, init.indexOf("("));
               if (tipo_inicial.equals(dimensao2)) {
               } else {
                  ErrorHandling.printError(ctx, "Tentar guardar um tipo diferente do tipo" + variables.get(id));
                  return false;
               }
            }
         }

         if (type.contains("list")) {
            is_cor = ("new" + type) == init;
         } else if (type.contains("string")) {
            is_cor = init.matches("\".*?\"");
         } else if (type.contains("integer")) {
            is_cor = isInt(init);
         } else if (type.contains("real")) {
            is_cor = isInt(init) || isReal(init);
         }

         else {

            is_cor = (init.contains("*" + dimension_map.get(type).get(0)));

            String[] substrings = init.split("\\s*((?<=[-+*/])|(?=[-+*/]))\\s*");
            List<String> substringList = Arrays.asList(substrings);

            String r = "";
            for (String it : substringList) {

               String dim = (variables.get(it));
               if (dimension_map.containsKey(dim)) {
                  r = r + dimension_map.get(dim).get(0);
               } else {
                  r = r + it;
               }
            }

            boolean is_cor3 = false;
            for (String str : substringList) {
               if (variables.containsKey(str)) {

                  if (dimension_map.get(variables.get(str)).get(0).equals(dimension_map.get(type).get(0))) {

                     is_cor3 = true;
                  } else {
                     is_cor3 = false;
                  }
               }

            }

            is_cor = is_cor || (r.equals(dimension_map.get(type).get(0))) || is_cor3;

         }

         if (is_cor) {
            return true;
         } else {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Atribuicao incorreta!");
            return false;

         }

      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Uma variável não inicializada!");
         return false;
      }

      // return res;
   }

   @Override
   public Boolean visitInit(DimanaParser.InitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitLoop(DimanaParser.LoopContext ctx) {
      Boolean res = null;
      String numero = ctx.expression(0).getText();
      String expressao = ctx.expression(1).getText();
      String primeira_var = ctx.ID().getText();

      // Verificar se a variavel existe e se é inteiro
      if (variables.containsKey(primeira_var)) {
         if (!variables.get(primeira_var).contains("integer")) {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável não é inteira!");
            return false;
         }
      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável não inicializada!");
         return false;
      }

      // Verifica se a variavel expressao está no array de variaveis
      if (variables.containsKey(expressao)) {
      } // verrifica se expressao contem length escrito
      else if (expressao.contains("length")) {
         // guarda a variavel que está dentro do length exemplo:"length(nmecs)"
         String[] parts = expressao.split("\\(");
         String[] parts2 = parts[1].split("\\)");
         String variavel = parts2[0];
         // verifica se a variavel está no array de variaveis
         if (variables.containsKey(variavel)) {
         } else {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável não inicializada!");
            return false;
         }

      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável não inicializada!");
         return false;
      }

      // Verificar se é inteiro
      if (isInt(numero)) {
      }
      // Verifica se é uma variavel registada
      else if (variables.containsKey(numero)) {
         // Verifica se é inteiro
         if (variables.get(numero).contains("integer")) {
         } else {
            ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : O número do loop não é inteiro ou uma variável inteira!");
            return false;
         }
      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : O número do loop não é inteiro ou uma variável inteira!");
         return false;
      }

      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitConditional(DimanaParser.ConditionalContext ctx) {
      Boolean res = null;
      // guarda expression
      String expressao = ctx.expression().getText();
      // Crtifica-se que possui um sinal de comparaçao == , <,>,>=,<=
      if (expressao.contains("==") || expressao.contains("<") || expressao.contains(">") || expressao.contains(">=")
            || expressao.contains("<=")) {
         // separa as variaveis por exemplo: x==y x>y x<y x>=y x<=y
         String[] variables = extractVariables(expressao);

         String var1 = variables[0];
         String var2 = variables[1];
         String dimension1 = "";
         String dimension2 = "";

         // Verifica se a var1 estao no array de variaveis
         if (this.variables.containsKey(var1)) {
            String type = this.variables.get(var1);
            if (type.equals("integer") || type.equals("real")) {
               dimension1 = type;
            } else if (type.equals("string")) {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável " + var2 + " é uma string!");
            } else {
               dimension1 = dimension_map.get(type).get(0);
            }
         } else {
            // Verifica se é um numero inteiro ou real
            if (isInt(var1) || isReal(var1)) {
            } else {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável " + var1 + " não inicializada!");
               return false;
            }
         }

         // Verifica se a var2 estao no array de variaveis
         if (this.variables.containsKey(var2)) {
            String type = this.variables.get(var2);
            if (type.equals("integer") || type.equals("real")) {
               dimension2 = type;
            } else if (type.equals("string")) {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável " + var2 + " é uma string!");
            } else {
               dimension2 = dimension_map.get(type).get(0);
            }
         } else {
            // Verifica se é um numero inteiro ou real
            if (isInt(var2) || isReal(var2)) {
            } else {
               ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável " + var2 + " não inicializada!");
               return false;
            }
         }

         // Vê se as duas dimensions são iguais
         if (dimension1.equals(dimension2)) {
         } else {
            ErrorHandling.printError(ctx,
                  "ERRO SEMÂNTICO : Variáveis " + var1 + " e " + var2 + " não têm a mesma dimensão!");
            return false;
         }

      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Expressão incorreta!");
         return false;
      }

      return visitChildren(ctx);
      // return res;
   }

   public static String[] extractVariables(String expression) {
      String regex = "(\\w+)";
      Pattern pattern = Pattern.compile(regex);
      Matcher matcher = pattern.matcher(expression);

      String[] variables = new String[2];
      int index = 0;

      while (matcher.find()) {
         variables[index] = matcher.group();
         index++;
      }

      return variables;
   }

   @Override
   public Boolean visitNew(DimanaParser.NewContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitString(DimanaParser.StringContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitLength(DimanaParser.LengthContext ctx) {
      Boolean res = null;
      String[] parts = ctx.getText().split("\\(");
      String[] parts2 = parts[1].split("\\)");
      String variavel = parts2[0];
      if (variables.containsKey(variavel)) {
         return visitChildren(ctx);
      } else {
         ErrorHandling.printError(ctx, "ERRO SEMÂNTICO : Variável não inicializada!");
         return false;
      }
      // return res;
   }

   @Override
   public Boolean visitAddSub(DimanaParser.AddSubContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitParenthesis(DimanaParser.ParenthesisContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitAndOr(DimanaParser.AndOrContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitCast(DimanaParser.CastContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitListAccess(DimanaParser.ListAccessContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitNumber(DimanaParser.NumberContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitInput(DimanaParser.InputContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitNot(DimanaParser.NotContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitComma(DimanaParser.CommaContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitMultDiv(DimanaParser.MultDivContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitRelational(DimanaParser.RelationalContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitId(DimanaParser.IdContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitListInit(DimanaParser.ListInitContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public Boolean visitType(DimanaParser.TypeContext ctx) {
      Boolean res = null;
      return visitChildren(ctx);
      // return res;
   }
}
