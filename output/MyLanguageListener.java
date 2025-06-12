// Generated from MyLanguage.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MyLanguageParser}.
 */
public interface MyLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MyLanguageParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#component}.
	 * @param ctx the parse tree
	 */
	void enterComponent(MyLanguageParser.ComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#component}.
	 * @param ctx the parse tree
	 */
	void exitComponent(MyLanguageParser.ComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#style}.
	 * @param ctx the parse tree
	 */
	void enterStyle(MyLanguageParser.StyleContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#style}.
	 * @param ctx the parse tree
	 */
	void exitStyle(MyLanguageParser.StyleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#template}.
	 * @param ctx the parse tree
	 */
	void enterTemplate(MyLanguageParser.TemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#template}.
	 * @param ctx the parse tree
	 */
	void exitTemplate(MyLanguageParser.TemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void enterLogic(MyLanguageParser.LogicContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#logic}.
	 * @param ctx the parse tree
	 */
	void exitLogic(MyLanguageParser.LogicContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MyLanguageParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MyLanguageParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#attributes}.
	 * @param ctx the parse tree
	 */
	void enterAttributes(MyLanguageParser.AttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#attributes}.
	 * @param ctx the parse tree
	 */
	void exitAttributes(MyLanguageParser.AttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(MyLanguageParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(MyLanguageParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(MyLanguageParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(MyLanguageParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MyLanguageParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MyLanguageParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(MyLanguageParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(MyLanguageParser.PropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(MyLanguageParser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MyLanguageParser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(MyLanguageParser.ValueContext ctx);
}