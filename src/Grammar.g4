grammar Grammar;

// Important note to self, keywords must be defined before IDENTIFIER definition
// to avoid being captured as identifiers rather than keywords

// Lexer rules

MULT : '*' ;
DIV  : '/' ;
PLUS : '+' ;
MINUS : '-';
DOT : '.' ;
ASSIGN : ':=' ;
EQUALS : '==' ;

LT : '<' ;
LTE : '<=' ;

GT : '>' ;
GTE : '>=' ;


LPAR : '(' ;
RPAR : ')' ;
LBRACE : '{' ;
RBRACE : '}' ;

TYPES : ('int' | 'float' | 'boolean') ;

WHILE : 'while' ;
IF : 'if' ;
ELIF : 'elif' ;
THEN : 'then' ;
ELSE : 'else' ;


fragment
TRUE : 'true' | 'TRUE' ;

fragment
FALSE : 'false' | 'FALSE' ;

BOOL : (TRUE | FALSE);

OR : 'OR' | 'or' |'|' ;
AND : 'AND' | 'and' | '&' ;
NOT : 'NOT' | 'not' | '!' ;

fragment
DIGIT : [0-9] ;

INTEGER : [0-9]+ ;

FLOAT : DIGIT* DOT DIGIT+ ;

WS : [ \t\r\n]+ -> skip ;

fragment
CHARACTER : [A-Za-z] ;

IDENTIFIER : CHARACTER (CHARACTER | INTEGER | '_')* ;

// Parser rules

prog : statements EOF ;

statements : statements statement ';'   #multiStatement
           | statement ';'              #singleStatement
           ;

statement : while_statement             #whileLoop
          | if_statement                #ifStatement
          | assignment                  #assignmentStatement
          | comparison                  #compareStatement
          | arithmetic_statement        #arithStatement
          ;

arithmetic_statement : variable_arithmetic  #var_arith
                     | float_arithmetic     #float_arith
                     | int_arithmetic       #int_arith
                     ;

variable_arithmetic : MINUS variable_arithmetic         #varNegative
                    | LPAR value=variable_arithmetic RPAR     #varBracketed
                    | left=variable_arithmetic op=(MULT | DIV) right=variable_arithmetic   #varMultiplication
                    | left=variable_arithmetic op=(PLUS | MINUS) right=variable_arithmetic #varAddition
                    | IDENTIFIER #variable
                    ;

int_arithmetic : MINUS int_arithmetic                       #intNegative
          | LPAR value=int_arithmetic RPAR                        #intBracketed
          | left=int_arithmetic op=(MULT | DIV) right=int_arithmetic   #intMultiplication
          | left=int_arithmetic op=(PLUS | MINUS) right=int_arithmetic #intAddition
          | value=INTEGER     #int
          | value=IDENTIFIER  #int_identifier
          ;

float_arithmetic : MINUS float_arithmetic   #floatNegative
          | LPAR value=float_arithmetic RPAR      #floatBracketed
          | left=float_arithmetic op=(MULT | DIV) right=float_arithmetic   #floatMuplitication
          | left=float_arithmetic op=(PLUS | MINUS) right=float_arithmetic #floatAddition
          | value=FLOAT #float
          | value=IDENTIFIER #float_identifier
          ;

bool :    NOT value=bool             #booleanNegative
        | LPAR value=bool RPAR    #booleanBracketed
        | left=bool op=NOT right=bool     #booleanNotEquals
        | left=bool op=EQUALS right=bool  #booleanEquals
        | left=bool op=AND right=bool     #booleanAnd
        | left=bool op=OR right=bool      #booleanOr
        | value=BOOL              #boolean
        ;

assignment :
            type='boolean' variable=IDENTIFIER ASSIGN value=comparison      #declareAndAssignExpr
           | type='float' variable=IDENTIFIER ASSIGN value=float_arithmetic #declareAndAssignFloat
           | type='int' variable=IDENTIFIER ASSIGN value=int_arithmetic     #declareAndAssignInt

           | variable=IDENTIFIER ASSIGN value=variable_arithmetic   #assignVariableResult
           | variable=IDENTIFIER ASSIGN value=comparison            #assignBoolean
           | variable=IDENTIFIER ASSIGN value=float_arithmetic      #assignFloat
           | variable=IDENTIFIER ASSIGN value=int_arithmetic        #assignInt


           | type='boolean' variable=IDENTIFIER #declareBoolean
           | type='float' variable=IDENTIFIER   #declareFloat
           | type='int' variable=IDENTIFIER     #declareInt
           ;

comparison : left=IDENTIFIER sign=(LT | GT | LTE | GTE | EQUALS | NOT) right=IDENTIFIER #identifierComparison
           | left=arithmetic_statement sign=(LT | GT | LTE | GTE | EQUALS | NOT) right=arithmetic_statement #arithComparison
           | bool #booleanComparison
           ;

assignable : arithmetic_statement #assignArithmetic
           | comparison           #assignComparison
           ;

if_statement : IF condition=comparison LBRACE if_body=statements RBRACE ELSE LBRACE else_body=statements RBRACE #ifElse
             | IF condition=comparison LBRACE if_body=statements RBRACE #standardIf
             ;

while_statement : WHILE condition=comparison LBRACE body=statements RBRACE      #standardWhile
                ;