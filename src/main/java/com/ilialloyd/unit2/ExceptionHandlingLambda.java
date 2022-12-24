package com.ilialloyd.unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingLambda {

    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4, 5};
        int key = 0;

        // Solution 1 catching exception inside lambda
    /*
        process(someNumbers, key, (v, k) -> {
            try {
                System.out.println(v / k);
            } catch (ArithmeticException e) {
                System.out.println("An Arithmetic Exception happened");
            }
        });
     */

    //wrapping lambda another lambda that has exception handling
        process(someNumbers, key, wrapperLambda((v, k) ->   System.out.println(v / k)));

    }

    //Biconsumer interface - lambdada () icinde istifade edeceyimiz iki values e accept
    // vererek olari lambdada istifade elemmeyimize serait yaradir
    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> consumer) {
        for (int i : someNumbers) {
            consumer.accept(i, key);
        }
    }


    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (v,k)-> {
            try {
                consumer.accept(v, k);
            }catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }
}
