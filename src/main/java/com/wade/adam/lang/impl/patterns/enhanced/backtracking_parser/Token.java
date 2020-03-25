package com.wade.adam.lang.impl.patterns.enhanced.backtracking_parser;

import com.wade.adam.lang.impl.patterns.basic.llk_recursive_descent.LookaheadLexer;

public class Token {

    public int type;
    public String text;

    public Token(int type, String text) {
        this.type = type;
        this.text = text;
    }

    @Override
    public String toString() {
        String tokenName = LookaheadLexer.tokenNames[type];
        return "<'" + text + "'," + tokenName + ">";
    }
}
