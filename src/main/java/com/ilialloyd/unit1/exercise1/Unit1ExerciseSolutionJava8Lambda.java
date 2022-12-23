package com.ilialloyd.unit1.exercise1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Unit1ExerciseSolutionJava8Lambda {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carrol", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 38)
        );

        //Step 1: Sort list by last name
        Collections.sort(people,(p1,p2) -> p1.getLastName().compareTo(p2.getLastName()));

        //Step 2: Create a method that prints all elements in the list
        System.out.println("Print all people");
        // true means no any condition
        printConditionally(people, p->true);

        //Step 3: Create a method that prints all people that have last name Beginning with C
        System.out.println("Print all people with starting  last name 'C'");
        printConditionally(people, p -> p.getLastName().startsWith("C"));
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p : people) {
            if(condition.test(p))
                System.out.println(p);
        }
    }


    interface Condition {
        boolean test(Person p);
    }

}
