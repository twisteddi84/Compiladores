// Generated from Hello.g4 by ANTLR 4.12.0
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link HelloParser}.
 */
public interface HelloListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(HelloParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(HelloParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#conversation}.
	 * @param ctx the parse tree
	 */
	void enterConversation(HelloParser.ConversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#conversation}.
	 * @param ctx the parse tree
	 */
	void exitConversation(HelloParser.ConversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void enterHello(HelloParser.HelloContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#hello}.
	 * @param ctx the parse tree
	 */
	void exitHello(HelloParser.HelloContext ctx);
	/**
	 * Enter a parse tree produced by {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void enterBye(HelloParser.ByeContext ctx);
	/**
	 * Exit a parse tree produced by {@link HelloParser#bye}.
	 * @param ctx the parse tree
	 */
	void exitBye(HelloParser.ByeContext ctx);
}