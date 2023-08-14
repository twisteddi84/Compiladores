// Generated from Dimana.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DimanaParser}.
 */
public interface DimanaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DimanaParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DimanaParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(DimanaParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(DimanaParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#list_append}.
	 * @param ctx the parse tree
	 */
	void enterList_append(DimanaParser.List_appendContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#list_append}.
	 * @param ctx the parse tree
	 */
	void exitList_append(DimanaParser.List_appendContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(DimanaParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(DimanaParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(DimanaParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(DimanaParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#writeln}.
	 * @param ctx the parse tree
	 */
	void enterWriteln(DimanaParser.WritelnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#writeln}.
	 * @param ctx the parse tree
	 */
	void exitWriteln(DimanaParser.WritelnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(DimanaParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(DimanaParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(DimanaParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(DimanaParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#dimensionDef}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDef(DimanaParser.DimensionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#dimensionDef}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDef(DimanaParser.DimensionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void enterUnitDef(DimanaParser.UnitDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#unitDef}.
	 * @param ctx the parse tree
	 */
	void exitUnitDef(DimanaParser.UnitDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#varInicialization}.
	 * @param ctx the parse tree
	 */
	void enterVarInicialization(DimanaParser.VarInicializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#varInicialization}.
	 * @param ctx the parse tree
	 */
	void exitVarInicialization(DimanaParser.VarInicializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#assignament}.
	 * @param ctx the parse tree
	 */
	void enterAssignament(DimanaParser.AssignamentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#assignament}.
	 * @param ctx the parse tree
	 */
	void exitAssignament(DimanaParser.AssignamentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#init}.
	 * @param ctx the parse tree
	 */
	void enterInit(DimanaParser.InitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#init}.
	 * @param ctx the parse tree
	 */
	void exitInit(DimanaParser.InitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(DimanaParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(DimanaParser.LoopContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void enterConditional(DimanaParser.ConditionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#conditional}.
	 * @param ctx the parse tree
	 */
	void exitConditional(DimanaParser.ConditionalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code new}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNew(DimanaParser.NewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code new}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNew(DimanaParser.NewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterString(DimanaParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitString(DimanaParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code length}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLength(DimanaParser.LengthContext ctx);
	/**
	 * Exit a parse tree produced by the {@code length}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLength(DimanaParser.LengthContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(DimanaParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addSub}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(DimanaParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesis(DimanaParser.ParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesis}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesis(DimanaParser.ParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndOr(DimanaParser.AndOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andOr}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndOr(DimanaParser.AndOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCast(DimanaParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCast(DimanaParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listAccess}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListAccess(DimanaParser.ListAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listAccess}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListAccess(DimanaParser.ListAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(DimanaParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(DimanaParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code input}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInput(DimanaParser.InputContext ctx);
	/**
	 * Exit a parse tree produced by the {@code input}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInput(DimanaParser.InputContext ctx);
	/**
	 * Enter a parse tree produced by the {@code not}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(DimanaParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code not}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(DimanaParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comma}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterComma(DimanaParser.CommaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comma}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitComma(DimanaParser.CommaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultDiv(DimanaParser.MultDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multDiv}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultDiv(DimanaParser.MultDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relational}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterRelational(DimanaParser.RelationalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relational}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitRelational(DimanaParser.RelationalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(DimanaParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(DimanaParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListInit(DimanaParser.ListInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listInit}
	 * labeled alternative in {@link DimanaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListInit(DimanaParser.ListInitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DimanaParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(DimanaParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DimanaParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(DimanaParser.TypeContext ctx);
}