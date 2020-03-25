package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class ListParser extends Parser {

    public ListParser(Lexer input) {
        super(input);
    }

    public void list(){
        match(ListLexer.LBRACK); elements(); match(ListLexer.RBRACK);
    }

    private void elements(){
        element();
        while(lookahead.type == ListLexer.COMMA){
            match(ListLexer.COMMA);
            element();
        }
    }

    private void element() {
        if(lookahead.type == ListLexer.NAME){
            match(ListLexer.NAME);
        }
        else if(lookahead.type == ListLexer.LBRACK){
            list();
        }
        else{
            throw new Error("expecting name or list; found "+lookahead);
        }
    }

}
