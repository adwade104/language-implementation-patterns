package com.wade.adam.lang.impl.patterns.basic.ll1_recursive_descent;

public class Driver {

    public static void main(String[] args){

        String list = "[apple,pear]";

        ListLexer listLexer = new ListLexer(list);
        ListParser listParser = new ListParser(listLexer);
        listParser.list();

    }

}
