package com.ilialloyd.unit3;

import com.ilialloyd.unit1.exercise1.Person;

import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        //These loops are called external loops
        //also you also specify how you want to iterate, you declare index and etc
        System.out.println("Using for loop");
        for (int i=0;i<people.size();i++){
            System.out.println(people.get(i));
        }

        System.out.println("\nUsing for-in loop");
        for(Person p: people){
            System.out.println(p);
        }

        //Internal iteration- it also depend on runtime how to iterate
        System.out.println("\nUsing Lambda for each loop");

        //foreach takes Consumer
        people.forEach(p-> System.out.println(p));
        //or
        // people.forEach(System.out::println)

    }

}
