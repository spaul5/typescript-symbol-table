/** A TypeScript-inspired grammar for demonstrating symbol table management */
grammar TypeScript;

@header {
import org.antlr.symtab.*;
}

program returns [Scope scope] : sourceElement* EOF ;

sourceElement : (stat | classDecl )+ ;

expr returns [Type etype]
    : name=ID                #id
    | 'this'            #this
    | NUMBER            #number
    | STRING            #string
    | funcCall          #functionCall
    | expr '.' ID       #fieldRef
    | expr '=' expr     #assign
    ;

stat : codeBlock | var | fieldVar | function | method | expr ';' ;

var returns [Type etype] : 'var' name=ID ':' name2=type ';' ;
fieldVar returns [Type etype] : name=ID ':' name2=type ';' ;

function returns [Scope scope] : 'function' name=ID '('param* ')' (':' name2=type)? codeBlock ;
method returns [Scope scope] : name=ID '(' param* ')' (':' name2=type)? codeBlock ;
param : paramArg (',' paramArg)* ;
paramArg returns [Type etype] : name=ID ':' type;


classDecl returns [Scope scope] : 'class' name=ID ('extends' name2=ID)? classBody ;
classBody returns [Scope scope] : '{' (stat)* '}' ;

codeBlock returns [Scope scope] : '{' (stat)* '}';


type : 'number' | 'string' | 'void' | ID ;
NUMBER : [0-9]+ ;
STRING : '"' .*? '"' ;
ID : [a-zA-Z_] [a-zA-Z0-9_]* ;

funcCall : name=ID '(' arg1* ')' ;
arg1 : arg (',' arg)* ;
arg : ID | NUMBER | STRING ;



BLOCK_COMMENT : '/*' .*? '*/' ;
LINE_COMMENT : '//' .*? '\n' ;

WS : [ \t\r\n]+ -> skip;