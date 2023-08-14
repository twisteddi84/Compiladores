// Generated from Ex5.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex5Parser}.
 */
public interface Ex5Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex5Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex5Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex5Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex5Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex5Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex5Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex5Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(Ex5Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex5Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(Ex5Parser.ExprContext ctx);
}