package com.wade.adam.lang.impl.patterns.ll1_recursive_descent;

public class Token {

    public int type;
    public String text;

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        String tokenName = ListLexer.tokenNames[type];
        return "<'" + text + "'," + tokenName + ">";
    }

}
