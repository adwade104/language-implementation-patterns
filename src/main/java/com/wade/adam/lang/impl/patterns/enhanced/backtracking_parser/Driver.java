package com.wade.adam.lang.impl.patterns.enhanced.backtracking_parser;

public class Driver {

    public static void main(String[] args) throws RecognitionException {

        String line = "[a,b]=[b,a]";

        BacktrackLexer backtrackLexer = new BacktrackLexer(line);
        BacktrackParser backtrackParser = new BacktrackParser(backtrackLexer);
        backtrackParser.stat();

    }

}
