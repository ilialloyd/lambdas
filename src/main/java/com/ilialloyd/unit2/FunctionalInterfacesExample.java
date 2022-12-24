package com.ilialloyd.unit2;

import com.ilialloyd.unit1.exercise1.Person;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class FunctionalInterfacesExample {

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
        performConditionally(people, p->true, p -> System.out.println(p));

        //Step 3: Create a method that prints all people that have last name Beginning with C
        System.out.println("Print all people with starting  last name 'C'");
        performConditionally(people, p -> p.getLastName().startsWith("C"), p-> System.out.println(p));
    }

    //We use default Predicate. java.util.function's functions instead of create manual Interfaces
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p : people) {
            if(predicate.test(p))
                consumer.accept(p);
        }
    }

}
