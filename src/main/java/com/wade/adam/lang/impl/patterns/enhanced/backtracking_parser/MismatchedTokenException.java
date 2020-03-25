package com.wade.adam.lang.impl.patterns.enhanced.backtracking_parser;

public class MismatchedTokenException extends RecognitionException {
    public MismatchedTokenException(String msg) {
        super(msg);
    }
}