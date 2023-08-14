import org.stringtemplate.v4.*;
import java.util.*;
import java.io.*;

@SuppressWarnings("CheckReturnValue")

public class DimCompiler extends DimanaBaseVisitor<ST> {
   private STGroup templates = new STGroupFile("Dimana.stg");

   HashMap<String, String> types_var = new HashMap<String, String>();

   HashMap<String, String> variables = new HashMap<String, String>();
   HashMap<String, List<String>> variables_map = new HashMap<String, List<String>>();
   HashMap<String, DimGenerator> classes = new HashMap<String, DimGenerator>();
   HashMap<String, String> convert = new HashMap<String, String>();

   String id_vars = "";

   // Method to remove the last character from a string
   public static String removeLastChar(String s) {
      return (s == null || s.length() == 0)
            ? null
            : (s.substring(0, s.length() - 1));
   }

   // Method to check if a string can be parsed as a numeric value
   public static boolean isNumeric(String string) {
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

   @Override
   public ST visitProgram(DimanaParser.ProgramContext ctx) {

      // Create a new StringTemplate instance for the 'module' template
      ST res = templates.getInstanceOf("module");

      // Initialize the mapping of variable types
      types_var.put("integer", "Integer");
      types_var.put("real", "Double");
      types_var.put("string", "String");

      res.add("name", "output");

      // Iterate over the 'stat' rules in the program
      for (DimanaParser.StatContext stat : ctx.stat()) {
         res.add("statements", visit(stat));
      }
      return res;
   }

   @Override
   public ST visitStat(DimanaParser.StatContext ctx) {
      // Check the type of the 'stat' rule and visit the corresponding rule
      if (ctx.write() != null)
         return visit(ctx.write());

      if (ctx.dimensionDef() != null)
         return visit(ctx.dimensionDef());

      if (ctx.use() != null)
         return visit(ctx.use());

      if (ctx.unitDef() != null)
         return visit(ctx.unitDef());

      if (ctx.varInicialization() != null)
         return visit(ctx.varInicialization());

      if (ctx.list_append() != null)
         return visit(ctx.list_append());

      if (ctx.assignament() != null)
         return visit(ctx.assignament());

      if (ctx.loop() != null)
         return visit(ctx.loop());

      if (ctx.conditional() != null)
         return visit(ctx.conditional());

      if (ctx.prefix() != null)
         return visit(ctx.prefix());

      if (ctx.use() != null)
         return visit(ctx.use());

      if (ctx.writeln() != null)
         return visit(ctx.writeln());

      // If none of the above conditions match, return a new instance of the
      // "statement" template
      return templates.getInstanceOf("statement");
   }

   @Override
   public ST visitList_append(DimanaParser.List_appendContext ctx) {

      // Create a new StringTemplate instance for the 'list_append' template
      ST res = templates.getInstanceOf("list_append");

      // Get the variable name from the 'ID' rule
      String var = ctx.ID().getText();

      // Split the expression text to extract the label
      String[] parts = ctx.expression().getText().split("\"");

      res.add("label", "\"" + parts[1] + "\"");
      res.add("id", var);

      // Check if the expression contains "integer" or "real" and set the expr
      // attribute accordingly
      if (ctx.expression().getText().contains("integer") || ctx.expression().getText().contains("real")) {
         res.add("expr", visit(ctx.expression()));
      } else {
         res.add("expr", "new java.util.Scanner(System.in).nextLine()");
      }
      return res;
   }

   @Override
   public ST visitRead(DimanaParser.ReadContext ctx) {

      // Create a new StringTemplate instance for the 'read' template
      ST res = templates.getInstanceOf("read");

      // Visit the expression within the 'read' rule and add it to the 'expression'
      // attribute of the template
      res.add("expression", visit(ctx.expression()));
      return res;
   }

   @Override
   public ST visitWrite(DimanaParser.WriteContext ctx) {

      // Visit the expression within the 'read' rule and add it to the 'expression'
      // attribute of the template
      ST res = templates.getInstanceOf("write");

      // Get the raw expression text
      String rawExpr = ctx.expression().getText();

      String type = "";
      String value = "";

      // Check if the raw expression contains parentheses
      if (rawExpr.contains("(")) {

         // Split the expression to extract the type and value
         type = rawExpr.split("\\(")[0];

         value = rawExpr.substring(type.length() + 1, rawExpr.length() - 1); // remove type( and )
      }

      // Split the value to extract the length and name
      String length = value.split(",")[1];
      String name = value.split(",")[0];

      StringBuilder sb = new StringBuilder();

      // Check if the type is "string" and build the corresponding expression
      if (type.contains("string")) {
         sb.append("String.format(\"%" + length + "s" + "\"," + name + ")");
      }

      // Set the 'value' attribute of the 'write' template
      res.add("value", sb.toString());
      return res;
   }

   @Override
   public ST visitWriteln(DimanaParser.WritelnContext ctx) {

      // Create a new StringTemplate instance for the 'writeln' template
      ST res = templates.getInstanceOf("writeln");

      // Get the raw expression text and split it by commas
      String rawExpr = ctx.expression().getText();

      String[] rawExprSplit = rawExpr.split(",\\s*(?![^()]*\\))");

      // Check if the raw expression contains "string"
      if (rawExpr.contains("string")) {
         StringBuilder sb = new StringBuilder();
         StringBuilder tamanhos = new StringBuilder();
         StringBuilder vars = new StringBuilder();
         ArrayList<String> types = new ArrayList<String>();
         Boolean control = true;

         // Iterate over the raw expression parts
         for (int i = 0; i < rawExprSplit.length; i++) {
            String expr = rawExprSplit[i];
            String type = "";
            String value = "";

            // Check if the expression contains parentheses
            if (expr.contains("(")) {

               // Split the expression to extract the type and value
               type = expr.split("\\(")[0];
               types.add(type);
               value = expr.substring(type.length() + 1, expr.length() - 1);
            }

            // Split the value to extract the length and name
            String length = value.split(",")[1];
            String name = value.split(",")[0];
            if (name.contains("[") && name.contains("]")) {
               name = name.replace("[", ".get(");
               name = name.replace("]", "-1)");
            }

            vars.append(name);

            // Append a comma if it's not the last element
            if (i < rawExprSplit.length - 1) {
               vars.append(", ");
            }

            // Append the format string to the 'tamanhos' string builder
            tamanhos.append("%" + length + "s");
         }

         // Check if all types are "string" and build the corresponding expression
         for (String type : types) {
            if (!type.contains("string")) {
               control = false;
            }
         }

         if (control) {
            sb.append("String.format(\"" + tamanhos + "\"," + vars + ")");
         }

         res.add("value", sb.toString());
      } else if (rawExpr.startsWith("\"") && rawExpr.endsWith("\"")) {
         res.add("value", rawExpr);

      } else {
         String[] classe_var = rawExprSplit[0].split("\"");
         String[] var = classe_var[1].split(":");

         String type = "";
         for (String s : variables.keySet()) {
            if (s.equals(rawExprSplit[1])) {
               type = variables.get(s);
            }
         }
         // Build the expression for non-string types
         res.add("value",
               rawExprSplit[0] + " + " + rawExprSplit[1] + ".getValue1() " + "+ \" " + classes.get(type).getVar_suf()
                     + "\"");
      }
      return res;
   }

   @Override
   public ST visitPrefix(DimanaParser.PrefixContext ctx) {

      // Create a new StringTemplate instance for the 'prefix' template
      ST res = templates.getInstanceOf("prefix");

      // Set the 'id' and 'number' attributes of the template
      res.add("id", ctx.ID().getText());
      res.add("number", ctx.NUMBER().getText());
      return res;
   }

   @Override
   public ST visitDimensionDef(DimanaParser.DimensionDefContext ctx) {

      // Create a new StringTemplate instance for the 'write' template
      ST res = templates.getInstanceOf("write");

      String class_name = "";
      String var = "";
      String var_type = "";
      String var_suf = "";

      // Determine the variable type based on the 'type' rule
      if (ctx.type().getText().equals("integer")) {
         var_type = "int";
      } else if (ctx.type().getText().equals("real")) {
         var_type = "double";
      } else if (ctx.type().getText().equals("string")) {
         var_type = "String";
      } else {
         var_type = ctx.type().getText();
      }

      if (ctx.expression() != null) {

         // Split the expression to extract the class name and variable information
         String[] parts = ctx.expression().getText().split("[\\[\\]]");

         class_name = parts[0];

         if (parts[1].contains(",")) {
            var = parts[1].split(",")[0];
            var_suf = parts[1].split(",")[1];
         } else {
            var = parts[1];
         }

      } else {
         // Extract the class name and variable information from the 'assignament' rule
         class_name = ctx.assignament().ID().getText();
         var = ctx.assignament().init().expression().getText();
         String class1;
         String class2;

         try {

            // Split the variable information by '/' for division
            String[] conv_split = var.split("/");
            class1 = conv_split[0];
            class2 = conv_split[1];
            var_suf = classes.get(class1).getVar_suf() + "/" + classes.get(class2).getVar_suf();

            if (conv_split.length == 3) {
               String class3 = conv_split[2];
               var_suf = classes.get(class1).getVar_suf() + "/" + classes.get(class2).getVar_suf() + "/"
                     + classes.get(class3).getVar_suf();
            }

         } catch (Exception e) {

            // Split the variable information by '*' for multiplication
            String[] conv_split = var.split("\\*");
            class1 = conv_split[0];
            class2 = conv_split[1];
            var_suf = classes.get(class1).getVar_suf() + "*" + classes.get(class2).getVar_suf();

            if (conv_split.length == 3) {
               String class3 = conv_split[2];
               var_suf = classes.get(class1).getVar_suf() + "*" + classes.get(class2).getVar_suf() + "*"
                     + classes.get(class3).getVar_suf();
            }

         }

      }

      // Create a DimGenerator instance with the class name, variable, type, and
      // suffix information
      DimGenerator dim = new DimGenerator(class_name, var, var_type, var_suf);

      // Add the DimGenerator instance to the 'classes' HashMap
      classes.put(class_name, dim);

      // Set the 'value' attribute of the 'write' template
      res.add("value", "\"" + class_name + " created" + "\"");

      return res;
   }

   @Override
   public ST visitUnitDef(DimanaParser.UnitDefContext ctx) {

      // Create a new StringTemplate instance for the 'write' template
      ST res = templates.getInstanceOf("write");

      String class_name = ctx.ID().getText();
      String var = ctx.expression(0).getText();
      String conv = ctx.expression(1).getText();

      // Add the conversion information to the 'convert' map with the variable as the
      // key
      convert.put(var, conv);

      // Set the 'value' attribute of the 'write' template
      res.add("value", "\"Convertion: " + var + " = " + conv + "\"");
      return res;
   }

   @Override
   public ST visitVarInicialization(DimanaParser.VarInicializationContext ctx) {

      // First, check if the variable has already been declared
      String id = ctx.ID().getText();
      if (variables.containsKey(id)) {
         System.err.println("Variable " + id + " already declared");
         System.exit(0);
      }

      String type = ctx.type().getText();
      // Add the variable to the hashmap
      variables.put(id, type);

      // Create the ST
      ST varInit = templates.getInstanceOf("varInit");
      if (type.equals("integer")) {
         varInit.add("type", "int");
         varInit.add("id", id);

      } else if (type.equals("real")) {
         varInit.add("type", "double");
         varInit.add("id", id);

      } else if (type.equals("string")) {
         varInit.add("type", "String");
         varInit.add("id", id);

      } else if (type.substring(0, 4).equals("list")) {
         // ArrayList<String> list = new ArrayList<String>()
         String var_arr = type.substring(type.indexOf("[") + 1, type.indexOf("]"));

         boolean exist = false;
         for (String dim : types_var.keySet()) {
            if (dim.equals(var_arr)) {
               exist = true;
            }
         }
         if (exist) {
            varInit.add("type", "ArrayList<" + types_var.get(var_arr) + ">");
            varInit.add("id", id);
            varInit.add("init", " = new ArrayList<" + types_var.get(var_arr) + ">()");
         } else {
            String type_val = "";
            if (classes.get(var_arr).getVar_type().equals("int")) {
               type_val = "Integer";
            } else if (classes.get(var_arr).getVar_type().equals("double")) {
               type_val = "Double";
            } else if (classes.get(var_arr).getVar_type().equals("String")) {
               type_val = "String";
            }

            varInit.add("type", "ArrayList<" + type_val + ">");
            varInit.add("id", id);
            varInit.add("init", " = new ArrayList<" + type_val + ">()");
         }

      } else {

         boolean using = false;
         for (String dim : classes.keySet()) {
            if (dim.equals(type)) {
               using = true;
               varInit.add("type", "DimGenerator");
               varInit.add("id", id + " = new DimGenerator(\"" + type + "\", \"" + classes.get(type).getVar1()
                     + "\", \"" + classes.get(type).getVar_type() + "\")");
            }
         }

      }

      // If there is initialization, add it to the ST
      if (ctx.init() != null) {
         varInit.add("init", visit(ctx.init()));
      }
      return varInit;
   }

   @Override
   public ST visitAssignament(DimanaParser.AssignamentContext ctx) {
      ST res = templates.getInstanceOf("assignment");

      String id = ctx.ID().getText();
      ST expr = visit(ctx.init());
      boolean isDim = false;

      // Check if the variable is a Dimension (DimGenerator)
      for (String dim : classes.keySet()) {
         if (dim.equals(variables.get(id))) {
            isDim = true;
         }
      }

      if (expr != null) {
         if (isDim) {
            // Handle assignment for Dimension variables
            String text = ctx.init().getText().substring(ctx.init().getText().indexOf("=") + 1,
                  ctx.init().getText().length());
            if (text.contains("\"")) {
               String[] parts = text.split("\"");
               res.add("sout", "\"" + parts[1] + "\"");
            }
            res.add("id", id + ".setValue1(" + visit(ctx.init().expression()).render() + ");");
            return res;
         }

         String exp = ctx.init().getText();
         if (exp.length() > 4 && exp.substring(1, 5).equals("read")) {
            // Handle assignment for read statement
            ST read = templates.getInstanceOf("read");
            read.add("label", exp.substring(5, exp.length() - 1));
            read.add("expr", id);
            return read;

         } else if (ctx.init().getText().substring(1, 13).equals("integer(read")) {
            // Handle assignment for integer(read) statement
            String initexp = ctx.init().expression().getText();

            String lable = initexp.substring(initexp.indexOf("(") + 5, initexp.indexOf(")"));
            res.add("id", "System.out.println(" + lable + ");\n" + id);
            res.add("init", expr.render());
            return res;

         } else if (ctx.init().getText().substring(1, 10).equals("real(read")) {
            // Handle assignment for real(read) statement
            String initexp = ctx.init().expression().getText();

            String lable = initexp.substring(initexp.indexOf("(") + 5, initexp.indexOf(")"));
            res.add("id", "System.out.println(" + lable + ");\n" + id);
            res.add("init", expr.render());
            return res;

         }
         return res;

      } else {
         // Handle assignment without initialization expression
         res.add("id", id);
         res.add("init", expr.render());
         return res;
      }
   }

   @Override
   public ST visitInit(DimanaParser.InitContext ctx) {
      ST res = templates.getInstanceOf("init");
      ST expr = visit(ctx.expression());

      // Check if the expression can be parsed as an integer
      if (expr != null) {
         try {
            res.add("expr", Integer.parseInt(ctx.expression().getText()));
            return res;
         } catch (NumberFormatException e) {
            // Check if the expression can be parsed as a double
            try {
               res.add("expr", Double.parseDouble(ctx.expression().getText()));
               return res;
            } catch (NumberFormatException e2) {
               // If the expression cannot be parsed as a number, use the expression's
               // rendering
               res.add("expr", expr.render());
               return res;
            }
         }

      } else {
         return null;
      }
   }

   @Override
   public ST visitLoop(DimanaParser.LoopContext ctx) {
      ST loop = templates.getInstanceOf("forLoop");

      loop.add("id", ctx.ID().getText());
      loop.add("expr1", ctx.expression(0).getText());
      if (ctx.expression(1).getText().contains("length(")) {
         // Handle length expression as size of a list
         String[] expressao = ctx.expression(1).getText().split("length\\(");
         String value = removeLastChar(expressao[1]);
         loop.add("expr2", value + ".size()");
      } else {
         loop.add("expr2", ctx.expression(1).getText());
      }

      for (DimanaParser.StatContext statContext : ctx.stat()) {
         ST stat = visit(statContext);
         if (stat != null) {
            loop.add("statements", stat.render());
         }
      }

      return loop;
   }

   @Override
   public ST visitConditional(DimanaParser.ConditionalContext ctx) {
      ST conditional = templates.getInstanceOf("conditional");

      String expr = ctx.expression().getText();
      String[] parts = expr.split("");

      if (parts.length == 3) {
         if (isNumeric(parts[0]) && isNumeric(parts[2])) {
            conditional.add("expr", parts[0] + parts[1] + parts[2]);
         } else {
            conditional.add("expr",
                  "(int) " + parts[0] + ".getValue1()" + parts[1] + "(int) " + parts[2] + ".getValue1()");
         }
      } else {
         conditional.add("expr", ctx.expression().getText());
      }

      conditional.add("trueStatements", visit(ctx.stat(0)).render());
      conditional.add("elseStatements", visit(ctx.stat(1)).render());

      return conditional;
   }

   @Override
   public ST visitNew(DimanaParser.NewContext ctx) {

      ST res = null;
      return res;
   }

   @Override
   public ST visitString(DimanaParser.StringContext ctx) {
      ST res = templates.getInstanceOf("string");
      res.add("value", ctx.STRING_LITERAL().getText());
      return res;
   }

   @Override
   public ST visitLength(DimanaParser.LengthContext ctx) {

      ST res = null;
      return res;
   }

   @Override
   public ST visitAddSub(DimanaParser.AddSubContext ctx) {
      ST res = templates.getInstanceOf("multDiv");
      if (ctx.op.getText().charAt(0) == '+') {
         // Handle multiplication

         res.add("op", "+");

         if (isNumeric(ctx.expression(0).getText())) {
            res.add("e1", Integer.parseInt(ctx.expression(0).getText()));
         } else {
            boolean found = false;
            for (String x : variables.keySet()) {
               if (x.equals(ctx.expression(0).getText())) {
                  found = true;
               }
            }

            if (found) {
               for (String x : classes.keySet()) {

                  if (classes.get(x).getClass_name().equals(variables.get(ctx.expression(0).getText()))) {
                     if (classes.get(x).getVar_type().equals("integer")) {
                        res.add("e1", "Integer.parseInt(" + ctx.expression(0).getText() + ".getValue1().toString())");
                     } else {
                        res.add("e1",
                              "Double.parseDouble(" + ctx.expression(0).getText() + ".getValue1().toString())");
                     }

                  }

               }
            } else {
               res.add("e1", visit(ctx.expression(0)));
            }

         }
         if (isNumeric(ctx.expression(1).getText())) {
            res.add("e2", Integer.parseInt(ctx.expression(1).getText()));
         } else {
            boolean found = false;
            for (String x : variables.keySet()) {
               if (x.equals(ctx.expression(1).getText())) {
                  found = true;
               }
            }

            if (found) {
               for (String x : classes.keySet()) {

                  if (classes.get(x).getClass_name().equals(variables.get(ctx.expression(1).getText()))) {
                     if (classes.get(x).getVar_type().equals("integer")) {
                        res.add("e2", "Integer.parseInt(" + ctx.expression(1).getText() + ".getValue1().toString())");
                     } else {
                        res.add("e2", "Double.parseDouble(" + ctx.expression(1).getText() + ".getValue1().toString())");
                     }
                  }

               }
            } else {
               res.add("e2", visit(ctx.expression(1)));
            }

         }
      }
      return res;
   }

   @Override
   public ST visitParenthesis(DimanaParser.ParenthesisContext ctx) {
      return visit(ctx.expression());
   }

   @Override
   public ST visitAndOr(DimanaParser.AndOrContext ctx) {
      // ST res = templates.getInstanceOf("andOr");
      // res.add("e1", visit(ctx.expression(0)));
      // res.add("op", ctx.op.getText());
      // res.add("e2", visit(ctx.expression(1)));
      ST res = null;
      return res;
   }

   @Override
   public ST visitCast(DimanaParser.CastContext ctx) {
      // ST res = templates.getInstanceOf("cast");
      // res.add("type", visit(ctx.type()));
      // res.add("expr", visit(ctx.expression()));
      ST res = templates.getInstanceOf("multDiv");
      ST cast = templates.getInstanceOf("cast");

      if (ctx.type().getText().equals("integer")) {
         // Handle casting to integer
         cast.add("type", "Integer.parseInt(");// "Integer.parseInt(" + visit(ctx.expression()) + ")");
         if (ctx.expression().getText().substring(0, 4).equals("read")) {
            // Handle casting a user input to integer
            cast.add("expr", "new java.util.Scanner(System.in).nextLine())");
         } else {
            cast.add("expr", visit(ctx.expression()));
         }

      } else if (ctx.type().getText().equals("real")) {
         // Handle casting to real (double)
         cast.add("type", "Double.parseDouble(");// "Integer.parseInt(" + visit(ctx.expression()) + ")");
         if (ctx.expression().getText().substring(0, 4).equals("read")) {
            // Handle casting a user input to double
            cast.add("expr", "new java.util.Scanner(System.in).nextLine())");
         } else {
            cast.add("expr", visit(ctx.expression()));
         }
      }
      return cast;
   }

   @Override
   public ST visitListAccess(DimanaParser.ListAccessContext ctx) {
      // ST res = templates.getInstanceOf("listAccess");
      // res.add("id", ctx.ID().getText());
      // res.add("expr", visit(ctx.expression()));
      ST res = null;
      return res;
   }

   @Override
   public ST visitNumber(DimanaParser.NumberContext ctx) {
      ST res = templates.getInstanceOf("number");
      res.add("value", ctx.getText());
      return res;
   }

   @Override
   public ST visitInput(DimanaParser.InputContext ctx) {
      ST res = templates.getInstanceOf("read");
      String[] divided = ctx.getText().split("\"");
      res.add("label", "\"" + divided[1] + "\"");
      return res;
   }

   @Override
   public ST visitNot(DimanaParser.NotContext ctx) {
      // ST res = templates.getInstanceOf("not");
      // res.add("expr", visit(ctx.expression()));
      ST res = null;
      return res;
   }

   @Override
   public ST visitComma(DimanaParser.CommaContext ctx) {
      ST res = null;
      /*
       * String value = visit(ctx.expression(0));
       * String lenght = visit(ctx.expression(1));
       * res.add("value", value);
       * res.add("lenght", lenght);
       */
      return res;
   }

   @Override
   public ST visitMultDiv(DimanaParser.MultDivContext ctx) {
      // ST res = templates.getInstanceOf("multDiv");
      // res.add("e1", visit(ctx.expression(0)));
      // res.add("op", ctx.op.getText());
      // res.add("e2", visit(ctx.expression(1)));
      ST res = templates.getInstanceOf("multDiv");
      if (ctx.op.getText().charAt(0) == '*') {
         // Handle multiplication

         res.add("op", "*");

         for (String d : classes.keySet()) {
            if (classes.get(d).getVar1().equals(ctx.expression(1).getText())
                  && isNumeric(ctx.expression(0).getText())) {
               // Handle multiplying a numeric value with a variable from a class
               res.add("e1", Integer.parseInt(ctx.expression(0).getText()));
               res.add("e2", 1);
               classes.get(d).setValue1("" + Integer.parseInt(ctx.expression(0).getText()));
               return res;
            }
         }

         if (isNumeric(ctx.expression(0).getText())) {
            res.add("e1", Integer.parseInt(ctx.expression(0).getText()));
         } else {
            res.add("e1", visit(ctx.expression(0)));
         }

         res.add("e2", visit(ctx.expression(1)));
         return res;

      } else if (ctx.op.getText().charAt(0) == '/') {
         // Handle division

         res.add("op", "/");

         if (isNumeric(ctx.expression(0).getText())) {
            res.add("e1", Integer.parseInt(ctx.expression(0).getText()));
         } else {
            boolean found = false;
            for (String x : variables.keySet()) {
               if (x.equals(ctx.expression(0).getText())) {
                  found = true;
               }
            }

            if (found) {
               for (String x : classes.keySet()) {

                  if (classes.get(x).getClass_name().equals(variables.get(ctx.expression(0).getText()))) {
                     if (classes.get(x).getVar_type().equals("integer")) {
                        res.add("e1", "Integer.parseInt(" + ctx.expression(0).getText() + ".getValue1().toString())");
                     } else {
                        res.add("e1",
                              "Double.parseDouble(" + ctx.expression(0).getText() + ".getValue1().toString())");
                     }

                  }

               }
            } else {
               res.add("e1", visit(ctx.expression(0)));
            }

         }
         if (isNumeric(ctx.expression(1).getText())) {
            res.add("e2", Integer.parseInt(ctx.expression(1).getText()));
         } else {
            boolean found = false;
            for (String x : variables.keySet()) {
               if (x.equals(ctx.expression(1).getText())) {
                  found = true;
               }
            }

            if (found) {
               for (String x : classes.keySet()) {

                  if (classes.get(x).getClass_name().equals(variables.get(ctx.expression(1).getText()))) {
                     if (classes.get(x).getVar_type().equals("integer")) {
                        res.add("e2", "Integer.parseInt(" + ctx.expression(1).getText() + ".getValue1().toString())");
                     } else {
                        res.add("e2", "Double.parseDouble(" + ctx.expression(1).getText() + ".getValue1().toString())");
                     }
                  }

               }
            } else {
               res.add("e2", visit(ctx.expression(1)));
            }

         }
      }

      return res;
   }

   @Override
   public ST visitRelational(DimanaParser.RelationalContext ctx) {
      // ST res = templates.getInstanceOf("relational");
      // res.add("e1", visit(ctx.expression(0)));
      // res.add("op", ctx.op.getText());
      // res.add("e2", visit(ctx.expression(1)));
      ST res = null;
      return res;
   }

   @Override
   public ST visitId(DimanaParser.IdContext ctx) {
      // ST res = templates.getInstanceOf("id");
      // res.add("id", ctx.ID().getText());
      ST res = templates.getInstanceOf("multDiv");
      res.add("e2", 1);
      return res;
   }

   @Override
   public ST visitListInit(DimanaParser.ListInitContext ctx) {
      // ST res = templates.getInstanceOf("listInit");
      // res.add("op", ctx.op.getText());
      // res.add("value", ctx.NUMBER().getText());
      ST res = null;
      return res;
   }

   @Override
   public ST visitType(DimanaParser.TypeContext ctx) {
      ST res = templates.getInstanceOf("type");
      res.add("type", ctx.getText());
      res = null;
      return res;
   }

}