package com.ilialloyd.unit1.exercise1;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Comparator;

@Getter
@Setter
@ToString
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Person {

    String firstName;
    String lastName;
    int age;


}
