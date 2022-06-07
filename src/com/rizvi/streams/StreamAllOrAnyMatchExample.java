package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class StreamAllOrAnyMatchExample {

    static Predicate<String> p1 = num -> num.length() > 7;
    static Predicate<Person> p2 = person -> person.getHeight() >= 140;
    static Predicate<Person> p3 = person -> person.getGender().equals("Male");

    public static void main(String[] args) {

        List<String> fruits = Arrays.asList("Apple", "Orange", "Graphs","Banana", "Pineapple");
        System.out.println("Length Check AllMatch :  "+fruits.stream().allMatch(p1));
        System.out.println("Length Check AnyMatch :  "+fruits.stream().anyMatch(p1));

        System.out.println("Person All Match  : "+PersonRepository.getAllPersons().stream().allMatch(p2));
        System.out.println("Person Any Match  : "+PersonRepository.getAllPersons().stream().anyMatch(p2));
        System.out.println("Person Any Match  : "+PersonRepository.getAllPersons().stream().anyMatch(p2.and(p3)));
    }
}
