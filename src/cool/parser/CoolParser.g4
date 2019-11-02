parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header {
    package cool.parser;
}

program: (classesProgram+=class_def SEMI)+ EOF;

class_def: CLASS classType=TYPE_ID (INHERITS inheritedClass=TYPE_ID)? LBRACE (definitions+=definition SEMI)* RBRACE;

definition:
    nameFunc=ID LPAREN (params+=declare_type (COMMA declare_type)*)? RPAREN COLON returnType=TYPE_ID LBRACE body=expr RBRACE #functionDefinition
    | declare_type (ASSIGN initVal=expr)?; #variableDefinition

declare_type: name=ID COLON type=TYPE_ID;

expr: name=ID ASSIGN value=expr;


