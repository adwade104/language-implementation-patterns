package com.wade.adam.lang.impl.patterns.sample;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Parser {

    private static StringTokenizer st;
    private static String input;

    public void parse(String line){

        st = new StringTokenizer(line + " $");
        input = st.nextToken();
        stat();
        if(input.equals("$")){
            System.out.println("OK");
        }

    }

    private void stat(){
        if(input.equals("return")){
            returnstat();
        }
        else {
            throw new RuntimeException("Unknown statement");
        }
    }

    private void returnstat(){
        match("return");
        expr();
        match(";");
    }

    private void expr(){
        match("x");
        match("+");
        match("1");
    }

    private void match(String s){

        if(input.equals(s)){
            consume();
        }
        else{
           throw new RuntimeException("Error:: expected " + input + " but found " + s);
        }

    }

    private void consume() {
        try {
            input =st.nextToken();
        } catch(NoSuchElementException e) {
            input =null;
        }
    }

}
