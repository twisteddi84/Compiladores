@SuppressWarnings("CheckReturnValue")
public class Interpreter extends CalculatorBaseVisitor<Integer> {

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr() != null){
         Object res = visit(ctx.expr());
         System.out.println("Result: " + res);
      }
      return null;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;
      Integer e1 = (Integer)visit(ctx.expr(0));
      Integer e2 = (Integer)visit(ctx.expr(1));

      if (e1 != null && e2 != null) {
         String op = ctx.op.getText();
         if (op.equals("+"))
            res = e1+e2;
         else if (op.equals("-"))
            res = e1-e2;
      }
      return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   // @Override public Integer visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
   //    Integer res = null;
   //    Integer e = (Integer)visit(ctx.Integer());
   //    if (e != null) {
   //       System.out.println("ExprUnary_num: " + e);
   //       String op = ctx.op.getText();
   //       if (op.equals("-"))
   //          res = -e;
   //    }
   //    System.out.print("ExprUnary_res: " + res);
   //    return res;
   // }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      Integer res = null;
      Integer e = (Integer)visit(ctx.Integer());
      if (e != null) {
         System.out.println("ExprUnary_num: " + e);
         String op = ctx.op.getText();
         if (op.equals("-"))
            res = -e;
      }
      System.out.print("ExprUnary_res: " + res);
      return res;
   }
   

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer res = null;
      Integer e1 = (Integer)visit(ctx.expr(0));
      Integer e2 = (Integer)visit(ctx.expr(1));

      if (e1 != null && e2 != null) {
         String op = ctx.op.getText();
         if (op.equals("/")){
            if (e2 == 0){
               System.err.println("ERRO: divisão por zero");
               System.exit(1);
            } else
               res = e1/e2;
         }
         else if (op.equals("*"))
            res = e1*e2;
         else if (op.equals("%")){
            if (e2 == 0){
               System.err.println("ERRO: divisão por zero");
               System.exit(1);
            } else
               res = e1%e2;
            }
      }
      return res;
   }
}
