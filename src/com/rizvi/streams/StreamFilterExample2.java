package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamFilterExample2 {

    static Predicate<Person> p1 = person -> person.getHeight() >= 120;
    static Predicate<Person> p2 = person -> person.getGender().equals("Female");

    public static void main(String[] args) {

        PersonRepository.getAllPersons()
                .stream()
                .filter(p1)
                .filter(p2)
                .collect(Collectors.toList()).forEach(System.out::println);


        System.out.println("##########################################################################################");
        PersonRepository.getAllPersons()
                .stream()
                .filter(p1.and(p2))
                .filter(person -> person.getKids() >= 2)
                .collect(Collectors.toList()).forEach(System.out::println);

    }
}
