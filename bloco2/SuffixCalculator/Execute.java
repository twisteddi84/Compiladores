@SuppressWarnings("CheckReturnValue")
public class Execute extends SuffixCalculatorBaseVisitor<String> {

   @Override
   public String visitProgram(SuffixCalculatorParser.ProgramContext ctx) {
      String res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitStat(SuffixCalculatorParser.StatContext ctx) {
      String res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitExprNumber(SuffixCalculatorParser.ExprNumberContext ctx) {
      return ctx.Number().getText();
      // return res;
   }

   @Override
   public String visitExprSuffix(SuffixCalculatorParser.ExprSuffixContext ctx) {
      Integer res = null;
      Integer e1 = Integer.parseInt(visit(ctx.expr(0)));
      Integer e2 = Integer.parseInt(visit(ctx.expr(1)));
      String operacao = ctx.op.getText();
      switch (operacao) {
         case "+":
            res = e1 + e2;
            break;
         case "-":
            res = e1 - e2;
            break;
         case "*":
            res = e1 * e2;
            break;
         case "/":
            if (e2 != 0)
               res = e1 / e2;
            else {
               System.err.println("Division by zero!!!");
               System.exit(0);
            }
            break; 
      }
      System.out.println("Resultado = " + res);
      return visitChildren(ctx);
      // return res;
   }
}
