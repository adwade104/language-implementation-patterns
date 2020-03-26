package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class ListLexer extends Lexer {
    public static int NAME = 2;
    public static int COMMA = 3;
    public static int LBRACK = 4;
    public static int RBRACK = 5;

    public static String[] tokenNames = {"n/a", "<EOF>", "NAME", "COMMA", "LBRACK", "RBRACK"};
    public String getTokenName(int x) { return tokenNames[x]; }

    public ListLexer(String input){
        super(input);
    }

    public Token nextToken() {
        System.out.println("Lexer identifying next token...");
        while(c != EOF){
            switch (c) {
                case ' ': case '\t': case '\n': case '\r': WS(); continue;
                case ',': System.out.println("Lexer recognized token: COMMA"); consume(); return new Token(COMMA, ",");
                case '[': System.out.println("Lexer recognized token: LBRACK"); consume(); return new Token(LBRACK, "[");
                case ']': System.out.println("Lexer recognized token: RBRACK"); consume(); return new Token(RBRACK, "]");
                default:
                    if(isLetter()) return NAME();
                    throw new Error("invalid character: "+c);
            }
        }
        System.out.println("Lexer recognized token: EOF");
        return new Token(EOF_TYPE, "<EOF>");
    }

    private boolean isLetter(){
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z';
    }

    private Token NAME(){
        System.out.println("Lexer recognized token: NAME");
        StringBuilder sb = new StringBuilder();
        do { sb.append(c); consume(); } while (isLetter());
        return new Token(NAME, sb.toString());
    }

    private void WS(){
        System.out.println("Lexer recognized token: WHITESPACE");
        while(c == ' ' || c == '\t' || c == '\n' || c == '\r') { consume(); };
    }

}
