package cs345.typescript;

import org.antlr.symtab.*;

import java.util.List;
import java.util.function.Function;

public class ComputeTypes extends TypeScriptBaseVisitor<Type> {
	protected StringBuilder buf = new StringBuilder();
	public static final Type VOID_TYPE = new PrimitiveType("void");
	public static final Type NUMBER_TYPE = new PrimitiveType("number");
	public static final Type STRING_TYPE = new PrimitiveType("string");
	protected Scope currentScope;


	@Override
	public Type visitId(TypeScriptParser.IdContext ctx) {
		VariableSymbol v = (VariableSymbol) currentScope.resolve(ctx.name.getText());
		ctx.etype = v.getType();
		return ctx.etype;
	}

	@Override
	public Type visitFunctionCall(TypeScriptParser.FunctionCallContext ctx) {
//		Type t = super.visitParam(TypeScriptParser.ParamContext);
//		FunctionSymbol f = (FunctionSymbol) currentScope.resolve(ctx.name.getText());
//		ctx.etype = f.getType();
		return ctx.etype;
	}

	@Override
	public Type visitNumber(TypeScriptParser.NumberContext ctx) {
		ctx.etype = NUMBER_TYPE;
		return ctx.etype;
	}

	@Override
	public Type visitString(TypeScriptParser.StringContext ctx) {
		ctx.etype = STRING_TYPE;
		return ctx.etype;
	}

	@Override
	public Type visitThis(TypeScriptParser.ThisContext ctx) {
		ClassSymbol c = (ClassSymbol) currentScope.getEnclosingScope();
		ctx.etype = new PrimitiveType(c.getName());
		return ctx.etype;
	}

	@Override
	public Type visitFieldRef(TypeScriptParser.FieldRefContext ctx) {
		ctx.etype = super.visit(ctx.expr());
		return ctx.etype;
	}

	@Override
	public Type visitAssign(TypeScriptParser.AssignContext ctx) {
		Type t = super.visit(ctx.expr(1));
		if (t != null)
			buf.append(t.toString());
		return t;
	}


	@Override
	public Type visitProgram(TypeScriptParser.ProgramContext ctx) {
		currentScope = ctx.scope;
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitSourceElement(TypeScriptParser.SourceElementContext ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitVar(TypeScriptParser.VarContext ctx) {
		VariableSymbol v = (VariableSymbol) currentScope.resolve(ctx.name.getText());
		ctx.etype = v.getType();
		return ctx.etype;
	}

	@Override
	public Type visitFieldVar(TypeScriptParser.FieldVarContext ctx) {
		return super.visitFieldVar(ctx);
	}

	@Override
	public Type visitStat(TypeScriptParser.StatContext ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitFunction(TypeScriptParser.FunctionContext ctx) {
		currentScope = ctx.scope;
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitParam(TypeScriptParser.ParamContext ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitParamArg(TypeScriptParser.ParamArgContext ctx) {
		return super.visitParamArg(ctx);
	}

	@Override
	public Type visitClassDecl(TypeScriptParser.ClassDeclContext ctx) {
		currentScope = ctx.scope;
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitMethod(TypeScriptParser.MethodContext ctx) {
		currentScope = ctx.scope;
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitClassBody(TypeScriptParser.ClassBodyContext ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitCodeBlock(TypeScriptParser.CodeBlockContext ctx) {
		currentScope = ctx.scope;
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitType(TypeScriptParser.TypeContext ctx) {
		return super.visitType(ctx);
	}

	@Override
	public Type visitArg1(TypeScriptParser.Arg1Context ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitFuncCall(TypeScriptParser.FuncCallContext ctx) {
		return super.visitChildren(ctx);
	}

	@Override
	public Type visitArg(TypeScriptParser.ArgContext ctx) {
		return super.visitChildren(ctx);
	}

	// S U P P O R T
	public String getRefOutput() {
		return buf.toString();
	}
}
