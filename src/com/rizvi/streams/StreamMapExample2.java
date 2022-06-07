package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMapExample2 {

    static List<String> toUpperTransform(List<Person> listOfPersons){
        return listOfPersons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    static Set<String> toUpperTransformSet(List<Person> listOfPersons){
        return listOfPersons.stream()
                .map(Person::getName)
                .map(String::toUpperCase)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {

        List<String> fruits  =  Arrays.asList("Apple","Orange","Banana", "Pineapple");
        List<Integer> fruitsLength = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());

         System.out.println("Length of fruits : "+fruitsLength);
        System.out.println("To UpperCase Result : "+toUpperTransform(PersonRepository.getAllPersons()));
        System.out.println("To UpperCase Set Result : "+toUpperTransformSet(PersonRepository.getAllPersons()));
    }
}
