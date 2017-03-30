package cs345.typescript;

import org.antlr.symtab.*;
import org.antlr.v4.runtime.misc.NotNull;

public class DefScopesAndSymbols extends TypeScriptBaseListener {
	public static final Type VOID_TYPE = new PrimitiveType("void");
	public static final Type NUMBER_TYPE = new PrimitiveType("number");
	public static final Type STRING_TYPE = new PrimitiveType("string");
	Scope currentScope;
	GlobalScope g;

	public Scope getGlobalScope() {
		return g;
	}

	@Override
	public void enterProgram(@NotNull TypeScriptParser.ProgramContext ctx) {
		g = new GlobalScope(null);
		ctx.scope = g;
		pushScope(g);
	}

	@Override
	public void exitProgram(@NotNull TypeScriptParser.ProgramContext ctx) {
		popScope();
	}

	@Override
	public void enterClassDecl(@NotNull TypeScriptParser.ClassDeclContext ctx) {
		ClassSymbol c = new ClassSymbol(ctx.name.getText());
		c.setEnclosingScope(currentScope);
		if (ctx.name2 != null) {
			c.setSuperClass(ctx.name2.getText());
		}
		currentScope.define(c);
		ctx.scope = c;
		pushScope(c);
	}

	@Override
	public void exitClassDecl(@NotNull TypeScriptParser.ClassDeclContext ctx) {
		popScope();
	}

	@Override
	public void enterFunction(@NotNull TypeScriptParser.FunctionContext ctx) {
		FunctionSymbol f = new FunctionSymbol(ctx.name.getText());
		if (ctx.name2 == null) {
			f.setType(VOID_TYPE);
		}
		else {
			f.setType(findType(ctx.name2.getText()));
		}
		f.setEnclosingScope(currentScope);
		currentScope.define(f);
		ctx.scope = f;
		pushScope(f);
	}

	@Override
	public void exitFunction(@NotNull TypeScriptParser.FunctionContext ctx) {
		popScope();
	}

	@Override
	public void enterMethod(@NotNull TypeScriptParser.MethodContext ctx) {
		MethodSymbol m = new MethodSymbol(ctx.name.getText());
		if (ctx.name2 == null) {
			m.setType(VOID_TYPE);
		}
		else {
			m.setType(findType(ctx.name2.getText()));
		}
		m.setEnclosingScope(currentScope);
		currentScope.define(m);
		ctx.scope = m;
		pushScope(m);
	}

	@Override
	public void exitMethod(@NotNull TypeScriptParser.MethodContext ctx) {
		popScope();
	}

	@Override
	public void enterCodeBlock(@NotNull TypeScriptParser.CodeBlockContext ctx) {
		LocalScope l = new LocalScope(currentScope);
		currentScope.nest(l);
		ctx.scope = l;
		pushScope(l);
	}

	@Override
	public void exitCodeBlock(@NotNull TypeScriptParser.CodeBlockContext ctx) {
		popScope();
	}

	@Override
	public void enterFieldVar(@NotNull TypeScriptParser.FieldVarContext ctx) {
		FieldSymbol f = new FieldSymbol(ctx.ID().getText());
		f.setType(findType(ctx.type().getText()));
		currentScope.define(f);
	}

	@Override
	public void enterVar(@NotNull TypeScriptParser.VarContext ctx) {
		VariableSymbol v = new VariableSymbol(ctx.ID().getText());
		v.setType(findType(ctx.type().getText()));
		currentScope.define(v);
	}

	@Override
	public void enterParamArg(@NotNull TypeScriptParser.ParamArgContext ctx) {
		VariableSymbol v = new VariableSymbol(ctx.ID().getText());
		v.setType(findType(ctx.type().getText()));
		currentScope.define(v);
	}


	// support
	private void pushScope(Scope s) {
		currentScope = s;
	}

	private void popScope() {
		currentScope = currentScope.getEnclosingScope();
	}

	private Type findType(String str) {
		Type t = null;
		switch(str) {
			case "void":
				t = VOID_TYPE;
				break;
			case "string":
				t = STRING_TYPE;
				break;
			case "number":
				t = NUMBER_TYPE;
				break;
			default:
				t = new PrimitiveType("global." + str);
				break;
		}
		return t;
	}
}