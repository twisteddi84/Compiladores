@SuppressWarnings("CheckReturnValue")
public class Interpreter extends PreffixCalculatorBaseVisitor<Double> {

   @Override public Double visitProgram(PreffixCalculatorParser.ProgramContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitStat(PreffixCalculatorParser.StatContext ctx) {
      Double res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Double visitExprPreffix(PreffixCalculatorParser.ExprPreffixContext ctx) {
      Double res = null;
      Double e1 = visit(ctx.expr(0));
      Double e2 = visit(ctx.expr(1));
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
      //return res;
   }

   @Override public Double visitExprNumber(PreffixCalculatorParser.ExprNumberContext ctx) {
      return Double.parseDouble(ctx.Number().getText());
      //return res;
   }
}
