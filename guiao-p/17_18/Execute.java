import java.util.HashMap;
import java.util.Map;

@SuppressWarnings("CheckReturnValue")
public class Execute extends CalComplexBaseVisitor<Complexo> {

   Map<String,Complexo> variaveis = new HashMap<>();

   @Override public Complexo visitProgram(CalComplexParser.ProgramContext ctx) {
      Complexo res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Complexo visitCommand(CalComplexParser.CommandContext ctx) {
      Complexo res = null;
      return visitChildren(ctx);
      //return res;
   }

   @Override public Complexo visitAssignment(CalComplexParser.AssignmentContext ctx) {
      Complexo res = null;
      String variavel = ctx.ID().getText();
      res = visit(ctx.expr());
      variaveis.put(variavel,res);
      return res;
      //return res;
   }

   @Override public Complexo visitOutput(CalComplexParser.OutputContext ctx) {
      Complexo res = visit(ctx.expr());
      if(res != null){
         System.out.println(res);
      }
      return res;
   }

   @Override public Complexo visitExprComplexo(CalComplexParser.ExprComplexoContext ctx) {
      Complexo res = null;
      String expressao = ctx.Complexo().getText();
      

      return res;
      //return res;
   }

   @Override public Complexo visitExprID(CalComplexParser.ExprIDContext ctx) {
      Complexo res = null;
      String variavel = ctx.ID().getText();
      if(variaveis.keySet().contains(variavel)){
         res = variaveis.get(variavel);
      }else{
         System.err.println("Variavel nao existe !");
      }
      return res;
   }
}
