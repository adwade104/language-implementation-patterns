package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public abstract class Lexer {
    public static final char EOF = (char) -1;
    public static final int EOF_TYPE = 1;
    String input;
    int p = 0; //current character index (in input)
    char c; //current character

    public Lexer(String input) {
        System.out.println("Initializing Lexer...");
        this.input = input;
        c = input.charAt(p);
        System.out.println(String.format("Pointer set to p = %d, Character set to c = '%s'", p,c));
        System.out.println("Lexer initialized.\n");
    }

    public void consume(){
        p++;
        if (p >= input.length()){
            c = EOF;
        }
        else{
            c = input.charAt(p);
        }
        System.out.println(String.format("Lexer consuming new character: p = %d, c = '%s'", p, c));
    }

    public abstract Token nextToken();
    public abstract String getTokenName(int x);

}
