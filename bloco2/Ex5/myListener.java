import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
@SuppressWarnings("CheckReturnValue")

public class myListener extends Ex5BaseListener {
   HashMap<Integer, String> variables = new HashMap<>();


   @Override public void enterExpr(Ex5Parser.ExprContext ctx) {
      Integer var1 = Integer.parseInt(ctx.getChild(0).getText());
      String var2 = ctx.getChild(2).getText();
      variables.put(var1,var2);
      //System.out.println(variables);
   }

   public HashMap<Integer, String> getVariables() {
      return variables;
   }

}

