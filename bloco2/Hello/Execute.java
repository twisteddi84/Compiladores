import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("CheckReturnValue")
public class Execute extends HelloBaseVisitor<String> {

   @Override
   public String visitMain(HelloParser.MainContext ctx) {
      String res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitConversation(HelloParser.ConversationContext ctx) {
      String res = null;
      return visitChildren(ctx);
      // return res;
   }

   @Override
   public String visitHello(HelloParser.HelloContext ctx) {
      String res = null;
      System.out.print("Olá");
      for (TerminalNode name : ctx.ID()) {
         System.out.print(" " + name.getText());
      }
      System.out.println("!");
      return null;
   }

   @Override
   public String visitBye(HelloParser.ByeContext ctx) {
      String res = null;
      System.out.print("Adeus");
      for (TerminalNode name : ctx.ID()) {
         System.out.print(" " + name.getText());
      }
      System.out.println("!");
      return null;
   }
}