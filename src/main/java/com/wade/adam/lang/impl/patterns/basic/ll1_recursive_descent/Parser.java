package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class Parser {

    public Lexer input;
    public Token lookahead;

    public Parser(Lexer input) {
        this.input = input;
        consume();
    }

    public void match(int x){
        if(lookahead.type == x){
            consume();
        }
        else{
            throw new Error("expecting " + input.getTokenName(x) + "; found " + lookahead);
        }
    }

    public void consume(){ lookahead = input.nextToken(); }

}
