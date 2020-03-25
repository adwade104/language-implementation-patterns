package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public abstract class Lexer {
    public static final char EOF = (char) -1;
    public static final int EOF_TYPE = 1;
    String input;
    int p = 0; //current character index (in input)
    char c; //current character

    public Lexer(String input) {
        this.input = input;
        c = input.charAt(p);
    }

    public void consume(){
        p++;
        if (p >= input.length()){
            c = EOF;
        }
        else{
            c = input.charAt(p);
        }
    }

    public void match(char x){
        if(c == x){
            consume();
        }
        else{
            throw new Error();
        }
    }

    public abstract Token nextToken();
    public abstract String getTokenName(int x);

}
