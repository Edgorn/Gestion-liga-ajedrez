import java.io.*;
import java.lang.String;
import java_cup.runtime.Symbol; 
import java_cup.sym; 

%%
%class Lexer
%unicode
%line
%column
%cup

%{
    int counter_com = 0;
    int counter_id = 0;
    String comentario="";
    String caracter="";
%}

%eof{
    if (counter_com!=0) {
        System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1)+". Falta por cerrar algún comentario.");}
    System.out.println("--- FIN DE CADENA ---");
%eof}

%state COMENTARIO
%state COMENTARIOLINEA
%state IDENTIFICADOR
%%
<YYINITIAL>{
    "leer"                              {return new Symbol (sym.LEER, yyline, yycolumn);}
    "mostrar"                           {return new Symbol (sym.MOSTRAR, yyline, yycolumn);}
    [a-zA-Z]                            {counter_id++; caracter+=yytext(); yybegin(IDENTIFICADOR);}
    [0-9]+                              {return new Symbol(sym.NUM, yyline, yycolumn, yytext());}
    "<-" | "<‐"                          {return new Symbol (sym.ASIGNACION, yyline, yycolumn);}
    "+"                                 {return new Symbol (sym.SUMA, yyline, yycolumn);}
    "-"                                 {return new Symbol (sym.RESTA, yyline, yycolumn);}
    "*"                                 {return new Symbol (sym.MULTIPLICACION, yyline, yycolumn);}
    "/"                                 {return new Symbol (sym.DIVISION, yyline, yycolumn);}
    ";"                                 {return new Symbol (sym.PUNTOCOMA, yyline, yycolumn);}
    "//"                                {yybegin(COMENTARIOLINEA);}
    "/*"                                {counter_com++; yybegin(COMENTARIO);}
    "*/"                                {System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1)
                                            +". Fin de comentario huérfano.");}
    "\n"|"\r"|"\r\n"|" "|"\t"           {}
    [^]                                 {System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1)
                                            +". Carácter no reconocido");}
}
<COMENTARIO>{
    "/*"                                {counter_com++;}
    "*/"                                {counter_com--;
                                        if (counter_com==0) {
                                            System.out.println(comentario); comentario = ""; yybegin(YYINITIAL);}
                                        }
}
    

<COMENTARIOLINEA>{
    "\n"                                {System.out.println("COMENTARIO: " + comentario);
                                            comentario ="";
                                            yybegin(YYINITIAL);}
    [^]                                 {comentario += yytext();}
}

<IDENTIFICADOR>{
    [a-zA-Z]                            {if (caracter!="error") {
                                            counter_id++; 
                                            if(counter_id>8) {
                                                caracter = "error";
                                            } else {
                                                caracter+=yytext();
                                            }
                                        }}

    " "|"\n"|"\r"|"\r\n"|"\t"           {if (caracter!="error") {
                                            caracter="";
                                            counter_id=0;
                                            return new Symbol (sym.ID, yyline, yycolumn, caracter);
                                        } else {
                                            System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1));
                                        }

                                        yybegin(YYINITIAL);}

    ";"                                 {if (caracter!="error") {
                                            return new Symbol (sym.ID, yyline, yycolumn, yytext());
                                            caracter="";
                                            counter_id=0;
                                        } else {
                                            System.out.println("Error en linea "+(yyline+1)+", columna "+(yycolumn+1));
                                        }

                                        return new Symbol (sym.PUNTOCOMA, yyline, yycolumn);
                                        yybegin(YYINITIAL);}

    [^]                                 {caracter="error";}
}