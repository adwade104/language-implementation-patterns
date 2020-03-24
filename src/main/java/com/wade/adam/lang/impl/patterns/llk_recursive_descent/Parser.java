package com.wade.adam.lang.impl.patterns.llk_recursive_descent;

public class Parser {

    Lexer input;
    Token[] lookahead;
    int k; //# of lookahead symbols
    int p; //circular index of next token position to fill

    public Parser(Lexer input, int k) {
        this.input = input;
        this.k = k;
        lookahead = new Token[k];
        for(int i = 1; i <= k; i++) {
            consume();
        }
    }

    public void consume(){
        lookahead[p] = input.nextToken();
        p = (p + 1) % k;
    }

    public Token LT(int i){
        return lookahead[(p+i-1) % k];
    }

    public int LA(int i){
        return LT(i).type;
    }

    public void match(int x){
        if(LA(1) == x){
            consume();
        }
        else {
            throw new Error("expecting " + input.getTokenName(x) + "; found "+LT(1));
        }
    }

}
