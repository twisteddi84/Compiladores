// Generated from CalComplex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalComplexParser}.
 */
public interface CalComplexListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalComplexParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalComplexParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(CalComplexParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(CalComplexParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalComplexParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalComplexParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 */
	void enterOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 */
	void exitOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprComplexo}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComplexo(CalComplexParser.ExprComplexoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprComplexo}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComplexo(CalComplexParser.ExprComplexoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprID(CalComplexParser.ExprIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprID(CalComplexParser.ExprIDContext ctx);
}