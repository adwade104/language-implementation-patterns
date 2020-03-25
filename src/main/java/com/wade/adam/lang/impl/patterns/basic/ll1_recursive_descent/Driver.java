package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class Driver {

    public static void main(String[] args){

        String list = "[apple,banana,[orange],pear]";

        ListLexer listLexer = new ListLexer(list);
        ListParser listParser = new ListParser(listLexer);
        listParser.list();

        //Expected to pass (no output)

        String invalidList = "[a,]";

        listLexer = new ListLexer(invalidList);
        listParser = new ListParser(listLexer);
        listParser.list();

        //Expected to fail with exception

    }

}
