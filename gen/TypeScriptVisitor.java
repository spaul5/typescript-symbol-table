// Generated from /Users/pablo/Documents/USF/S2.2/CS345repo/spaul5-symtab/grammars/cs345/typescript/TypeScript.g4 by ANTLR 4.5.1

import org.antlr.symtab.*;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TypeScriptParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TypeScriptVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(TypeScriptParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#sourceElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSourceElement(TypeScriptParser.SourceElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code number}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(TypeScriptParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code string}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString(TypeScriptParser.StringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(TypeScriptParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code this}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThis(TypeScriptParser.ThisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fieldRef}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldRef(TypeScriptParser.FieldRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code id}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TypeScriptParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assign}
	 * labeled alternative in {@link TypeScriptParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign(TypeScriptParser.AssignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat(TypeScriptParser.StatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(TypeScriptParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#fieldVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldVar(TypeScriptParser.FieldVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(TypeScriptParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethod(TypeScriptParser.MethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(TypeScriptParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#paramArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(TypeScriptParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDecl(TypeScriptParser.ClassDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(TypeScriptParser.ClassBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#codeBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCodeBlock(TypeScriptParser.CodeBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(TypeScriptParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#funcCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncCall(TypeScriptParser.FuncCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arg1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg1(TypeScriptParser.Arg1Context ctx);
	/**
	 * Visit a parse tree produced by {@link TypeScriptParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(TypeScriptParser.ArgContext ctx);
}