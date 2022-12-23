package com.ilialloyd.unit1;

public class TypeInterface {

    public static void main(String[] args) {
    //    StringLengthLambda myLambda = (s) -> s.length(); this can be like below line
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Ilham"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Ilham"));
    }

    interface StringLengthLambda {
        int getLength(String s);
    }
}
