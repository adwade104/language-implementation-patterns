package com.wade.adam.lang.impl.patterns.enhanced.backtracking_parser;

public class NoViableAltException extends RecognitionException {
    public NoViableAltException(String msg) {
        super(msg);
    }
}
