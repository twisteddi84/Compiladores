// Generated from CalComplex.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link CalComplexParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface CalComplexVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(CalComplexParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(CalComplexParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(CalComplexParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link CalComplexParser#output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput(CalComplexParser.OutputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprComplexo}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComplexo(CalComplexParser.ExprComplexoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprID}
	 * labeled alternative in {@link CalComplexParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprID(CalComplexParser.ExprIDContext ctx);
}