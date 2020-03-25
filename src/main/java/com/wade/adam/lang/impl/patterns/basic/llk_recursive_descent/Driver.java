package com.wade.adam.lang.impl.patterns.basic.llk_recursive_descent;

public class Driver {

    public static void main(String[] args){

        String list = "[a,b=c,[d,e]]";

        LookaheadLexer lookaheadLexer = new LookaheadLexer(list);
        LookaheadParser lookaheadParser = new LookaheadParser(lookaheadLexer, 2);
        lookaheadParser.list();

        //Expected to pass (No output)

        String invalidList = "[a,b=c,,[d,e]]";

        lookaheadLexer = new LookaheadLexer(invalidList);
        lookaheadParser = new LookaheadParser(lookaheadLexer, 2);
        lookaheadParser.list();

        //Expected to fail with exception

    }
}
