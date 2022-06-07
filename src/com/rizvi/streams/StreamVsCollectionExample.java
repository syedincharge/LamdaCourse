package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamVsCollectionExample {


    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Jhon");
        names.add("Adam");
        names.add("Nancy");

        for (String name : names) {
            System.out.println("Iteration 1 : "+name);
        }
        for (String name : names) {
            System.out.println("Iteration 2 : "+name);
        }

        Stream<String> stream = names.stream();
        stream.forEach(p -> System.out.println("Lambda Stream Way : "+p));
      //  stream.forEach(p -> System.out.println("Lambda Stream Way : "+p));


        List<String> personNames = PersonRepository
                .getAllPersons()
                .stream()
                .peek(person -> System.out.println(person))
                .map(Person::getName)
                .peek(System.out::println)
                .collect(Collectors.toList());


        System.out.println("Person Names  : "+personNames);
    }
}
