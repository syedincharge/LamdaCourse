package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {


    public static void main(String[] args) {

        List<String> names = Arrays.asList("Sam", "Anderson", "Peter", "Nancy");

//         Stream<String> allNames = names.stream();
//
//         Stream<String> updatedList = allNames.filter(s -> s.length() > 3);
//
//         updatedList.forEach(System.out :: println);


        names.stream().filter(s -> s.length() > 3).collect(Collectors.toList()).forEach(System.out::println);

        PersonRepository.getAllPersons()
                .stream()
                .filter(person -> person.getHeight() >= 140)
                .collect(Collectors.toList()).forEach(System.out::println);

        PersonRepository.getAllPersons()
                .stream()
                .filter(person -> person.getHeight() >= 140)
                .filter(person -> person.getGender().equals("Male"))
                .collect(Collectors.toList()).forEach(System.out::println);

//        List<Person> l1 = PersonRepository.getAllPersons()
//                .stream()
//                .filter(person -> person.getHeight() >= 140)
//                .collect(Collectors.toList());
//        l1.forEach(System.out::println);
    }
}
