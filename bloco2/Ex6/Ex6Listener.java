// Generated from Ex6.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Ex6Parser}.
 */
public interface Ex6Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Ex6Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(Ex6Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex6Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(Ex6Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Ex6Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex6Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Ex6Parser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link Ex6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(Ex6Parser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link Ex6Parser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(Ex6Parser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAddSub(Ex6Parser.ExprAddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAddSub}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAddSub(Ex6Parser.ExprAddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParent(Ex6Parser.ExprParentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParent}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParent(Ex6Parser.ExprParentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnary(Ex6Parser.ExprUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnary}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnary(Ex6Parser.ExprUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInteger(Ex6Parser.ExprIntegerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInteger}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInteger(Ex6Parser.ExprIntegerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(Ex6Parser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(Ex6Parser.ExprIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMultDivMod(Ex6Parser.ExprMultDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMultDivMod}
	 * labeled alternative in {@link Ex6Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMultDivMod(Ex6Parser.ExprMultDivModContext ctx);
}