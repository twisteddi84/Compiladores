import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SuppressWarnings("CheckReturnValue")
public class Execute extends FracLangBaseVisitor<Fraction> {

   private Map<String, Fraction> variaveis = new HashMap<>();

   @Override public Fraction visitDisplay(FracLangParser.DisplayContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
      //return res;
   }

   @Override public Fraction visitAssignment(FracLangParser.AssignmentContext ctx) {
      Fraction res = visit(ctx.expr());
      if(res != null){
         String variavel = ctx.ID().getText();
         variaveis.put(variavel, res);
      }
      return res;
   }

   @Override public Fraction visitExprFraction(FracLangParser.ExprFractionContext ctx) {
      Fraction res = null;
      String numero = ctx.Fraction().getText();
      res = new Fraction(numero);
      return res;
   }

   @Override public Fraction visitExprReduce(FracLangParser.ExprReduceContext ctx) {
      Fraction res = visit(ctx.expr());
      res = res.reduce(res);      
      return res;
   }

   @Override public Fraction visitExprRead(FracLangParser.ExprReadContext ctx) {
      String variavel = ctx.String().getText();
      variavel = variavel.substring(1, variavel.length()-1);
      Scanner sc = new Scanner(System.in);
      System.out.print(variavel+": ");
      Fraction res = null;
      if(variavel != null){
         String input = sc.nextLine();
         res = new Fraction(input);
      }
      return res;
   }

   @Override public Fraction visitExprAddSub(FracLangParser.ExprAddSubContext ctx) {
      Fraction res = null;
      Fraction res1 = visit(ctx.expr(0));
      Fraction res2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      if(res1  != null && res2 != null){
         int a = res1.num();
         int b = res1.denominador();
         int c = res2.num();
         int d = res2.denominador();
         if(op.equals("+")){
            res = new Fraction((a*d) + (c*b),b*d);
         }
         if(op.equals("-")){
            res = new Fraction((a*d) - (c*b),b*d);
         }
      }
      return res;
   }

   @Override public Fraction visitExprMultDiv(FracLangParser.ExprMultDivContext ctx) {
      Fraction res = null;
      Fraction res1 = visit(ctx.expr(0));
      Fraction res2 = visit(ctx.expr(1));
      String op = ctx.op.getText();
      if(res1  != null && res2 != null){
         int a = res1.num();
         int b = res1.denominador();
         int c = res2.num();
         int d = res2.denominador();
         if(op.equals("*")){
            res = new Fraction(a*c,b*d);
         }
         if(op.equals(":")){
            res = new Fraction(a*d,b*c);
         }
      }
      return res;
   }

   @Override public Fraction visitExprSinal(FracLangParser.ExprSinalContext ctx) {
      Fraction res = visit(ctx.expr());
      String op = ctx.op.getText();
      if(res != null){
         if(op.equals("-")){
            res = new Fraction(-res.num(),res.denominador());
         }
      }
      return res;
   }

   @Override public Fraction visitExprParent(FracLangParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Fraction visitExprID(FracLangParser.ExprIDContext ctx) {
      Fraction res = null;
      String variavel = ctx.ID().getText();
      if(!variaveis.keySet().contains(variavel)){
         System.err.println("Erro, variavel nao existe !");
      }else{
         res = variaveis.get(variavel);
      }
      return res;
   }
}
