// Generated from Dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DimanaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DimanaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DimanaParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(DimanaParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(DimanaParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#list_append}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_append(DimanaParser.List_appendContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#read}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead(DimanaParser.ReadContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#write}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite(DimanaParser.WriteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#writeln}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWriteln(DimanaParser.WritelnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DimanaParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(DimanaParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#dimensionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionDef(DimanaParser.DimensionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#unitDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitDef(DimanaParser.UnitDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#varInicialization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarInicialization(DimanaParser.VarInicializationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#assignament}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignament(DimanaParser.AssignamentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInit(DimanaParser.InitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop(DimanaParser.LoopContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#conditional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditional(DimanaParser.ConditionalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code new}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNew(DimanaParser.NewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(DimanaParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code length}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLength(DimanaParser.LengthContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(DimanaParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesis(DimanaParser.ParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOr(DimanaParser.AndOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(DimanaParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listAccess}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListAccess(DimanaParser.ListAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(DimanaParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code input}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInput(DimanaParser.InputContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(DimanaParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComma(DimanaParser.CommaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultDiv(DimanaParser.MultDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelational(DimanaParser.RelationalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(DimanaParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListInit(DimanaParser.ListInitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DimanaParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(DimanaParser.TypeContext ctx);
}