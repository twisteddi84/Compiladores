import java.util.HashMap;
@SuppressWarnings("CheckReturnValue")

public class Execute extends CalculatorBaseVisitor<Integer> {
   HashMap<String, Integer> vars = new HashMap<>();

   @Override public Integer visitProgram(CalculatorParser.ProgramContext ctx) {
      Integer res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Integer visitStat(CalculatorParser.StatContext ctx) {
      if (ctx.expr() != null) {
         Object res = visit(ctx.expr());
         System.out.println("Result: " + res);
      } else if (ctx.assignment() != null) {
         visit(ctx.assignment());
      }     
      return null;
   }

   @Override public Integer visitAssignment(CalculatorParser.AssignmentContext ctx) {
      if (ctx != null) {
         String id = ctx.ID().getText();
         Integer value = (Integer)visit(ctx.expr());
         vars.put(id, value);
      }
      return null;
   }

   @Override public Integer visitExprAddSub(CalculatorParser.ExprAddSubContext ctx) {
      Integer res = null;
      Integer num1 = (Integer)visit(ctx.expr(0));
      Integer num2 = (Integer)visit(ctx.expr(1));

      if (num1 != null && num2 != null) {
         String op = ctx.op.getText();
         switch (op) {
            case "+":
               res = num1 + num2;
               break;
            case "-":
               res = num1 - num2;
               break;
         }
      }
      return res;
   }

   @Override public Integer visitExprParent(CalculatorParser.ExprParentContext ctx) {
      return visit(ctx.expr());
   }

   @Override public Integer visitExprUnary(CalculatorParser.ExprUnaryContext ctx) {
      Integer res = (Integer)visit(ctx.expr());
      if (ctx.op.getText().equals("-")) {res = res * -1;}
      return res;
   }

   @Override public Integer visitExprID(CalculatorParser.ExprIDContext ctx) {
      return vars.get(ctx.ID().getText());
   }

   @Override public Integer visitExprInteger(CalculatorParser.ExprIntegerContext ctx) {
      return Integer.parseInt(ctx.Integer().getText());
   }

   @Override public Integer visitExprMultDivMod(CalculatorParser.ExprMultDivModContext ctx) {
      Integer res = null;
      Integer num1 = (Integer)visit(ctx.expr(0));
      Integer num2 = (Integer)visit(ctx.expr(1));

      if (num1 != null && num2 != null) {
         String op = ctx.op.getText();
         switch (op) {
            case "*":
               res = num1 * num2;
               break;
            case "/":
               if (num2 == 0) {
                  System.err.println("Division by zero");
                  System.exit(1);
               }
               res = num1 / num2;
               break;
            case "%":
               if (num2 == 0) {
                  System.err.println("Division by zero");
                  System.exit(1);
               }
               res = num1 % num2;
               break;
         }
      }
      return res;
   }
}