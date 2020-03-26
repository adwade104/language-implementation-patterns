package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class Parser {

    public Lexer input;
    public Token lookahead;

    public Parser(Lexer input) {
        System.out.println("Initializing parser...");
        this.input = input;
        consume();
        System.out.println("Parser initialized.\n");
    }

    public void match(int x){
        System.out.println("Parser attempting match...");
        if(lookahead.type == x){
            System.out.println(String.format("Lookahead token %s matches input token '%s'", lookahead.toString(), input.getTokenName(x)));
            consume();
        }
        else{
            throw new Error("expecting " + input.getTokenName(x) + "; found " + lookahead);
        }
        System.out.println("Done.\n");
    }

    public void consume(){
        lookahead = input.nextToken();
        System.out.println(String.format("Parser set lookahead token to: %s", input.getTokenName(lookahead.type)));
    }

}
