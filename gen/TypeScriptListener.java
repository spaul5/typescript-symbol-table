// Generated from /Users/pablo/Documents/USF/S2.2/CS345repo/spaul5-symtab/grammars/cs345/typescript/TypeScript.g4 by ANTLR 4.5.1

import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TypeScriptParser}.
 */
public interface TypeScriptListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void enterSourceElement(TypeScriptParser.SourceElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 */
	void exitSourceElement(TypeScriptParser.SourceElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code number}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(TypeScriptParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code number}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(TypeScriptParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterString(TypeScriptParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitString(TypeScriptParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code this}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterThis(TypeScriptParser.ThisContext ctx);
	/**
	 * Exit a parse tree produced by the {@code this}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitThis(TypeScriptParser.ThisContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fieldRef}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterFieldRef(TypeScriptParser.FieldRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fieldRef}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitFieldRef(TypeScriptParser.FieldRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code id}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(TypeScriptParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(TypeScriptParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(TypeScriptParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(TypeScriptParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(TypeScriptParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(TypeScriptParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#fieldVar}.
	 * @param ctx the parse tree
	 */
	void enterFieldVar(TypeScriptParser.FieldVarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#fieldVar}.
	 * @param ctx the parse tree
	 */
	void exitFieldVar(TypeScriptParser.FieldVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(TypeScriptParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(TypeScriptParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#method}.
	 * @param ctx the parse tree
	 */
	void enterMethod(TypeScriptParser.MethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#method}.
	 * @param ctx the parse tree
	 */
	void exitMethod(TypeScriptParser.MethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(TypeScriptParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(TypeScriptParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#paramArg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(TypeScriptParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#paramArg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(TypeScriptParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void enterClassDecl(TypeScriptParser.ClassDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classDecl}.
	 * @param ctx the parse tree
	 */
	void exitClassDecl(TypeScriptParser.ClassDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void enterCodeBlock(TypeScriptParser.CodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 */
	void exitCodeBlock(TypeScriptParser.CodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(TypeScriptParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(TypeScriptParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(TypeScriptParser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(TypeScriptParser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arg1}.
	 * @param ctx the parse tree
	 */
	void enterArg1(TypeScriptParser.Arg1Context ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arg1}.
	 * @param ctx the parse tree
	 */
	void exitArg1(TypeScriptParser.Arg1Context ctx);
	/**
	 * Enter a parse tree produced by {@link TypeScriptParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(TypeScriptParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link TypeScriptParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(TypeScriptParser.ArgContext ctx);
}