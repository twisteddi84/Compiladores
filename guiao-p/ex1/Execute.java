import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends StrLangBaseVisitor<String> {
   Map<String,String> variaveis = new HashMap<>();


   @Override public String visitPrint(StrLangParser.PrintContext ctx) {
      String res = visit(ctx.expr());
      System.out.println(res);
      return res;
      //return res;
   }

   @Override public String visitAssignment(StrLangParser.AssignmentContext ctx) {
      String res = visit(ctx.expr());
      String variavel = ctx.ID().getText();
      variaveis.put(variavel, res);
      return res;
      //return res;
   }

   @Override public String visitExprInput(StrLangParser.ExprInputContext ctx) {
      String res = null;
      String texto = ctx.String().getText(); 
      texto = texto.substring(1, texto.length()-1);
      Scanner sc = new Scanner(System.in);
      System.out.print(texto);
      res = sc.nextLine();
      return res;
   }

   @Override public String visitExprAddSub(StrLangParser.ExprAddSubContext ctx) {
      String res1 = visit(ctx.expr(0));
      String res2 = visit(ctx.expr(1));
      String res = null;
      String op = ctx.op.getText();
      if(op.equals("+")){
         res = res1 + res2;
      }
      if(op.equals("-")){
         res = res1.replace(res2, "");
      }
      return res;
   }
   @Override public String visitExprTrim(StrLangParser.ExprTrimContext ctx) {
      String res = visit(ctx.expr());
      res = res.trim();
      return res;
   }
   @Override public String visitExprSub(StrLangParser.ExprSubContext ctx) {
      String res1 = visit(ctx.expr(0));
      String res2 = visit(ctx.expr(1));
      String res3 = visit(ctx.expr(2));
      res1 = res1.replace(res2,res3);
      return res1;
   }

   @Override public String visitExprParenteses(StrLangParser.ExprParentesesContext ctx) {
      return visit(ctx.expr());
   }

   @Override public String visitExprString(StrLangParser.ExprStringContext ctx) {
      String res = ctx.String().getText();
      res = res.substring(1, res.length()-1);
      return res;
   }

   @Override public String visitExprID(StrLangParser.ExprIDContext ctx) {
      String res = variaveis.get(ctx.ID().getText());
      return res;
      //return res;
   }
}
