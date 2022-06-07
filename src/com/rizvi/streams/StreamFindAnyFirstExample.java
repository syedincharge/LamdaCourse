package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Optional;
import java.util.function.Predicate;

public class StreamFindAnyFirstExample {

    static Predicate<String> p1 = num -> num.length() > 7;
    static Predicate<Person> p2 = person -> person.getHeight() >= 140;
    static Predicate<Person> p3 = person -> person.getGender().equals("Male");

    public static void main(String[] args) {

        Optional<Person> findAny = findAny();
        if(findAny.isPresent())
        System.out.println("Find Any Result  "+findAny.get());
        else
            System.out.println("No Record Found");

        Optional<Person> findFirst = findFirst();
        if(findFirst().isPresent())
        System.out.println("Find First Result  "+findFirst().get());
        else
            System.out.println("No Record Found");
    }


        static Optional<Person> findAny(){
           return PersonRepository.getAllPersons()
                    .stream()
                    .filter(p2)
                    .findAny();

    }

    static Optional<Person> findFirst(){
        return PersonRepository.getAllPersons()
                .stream()
                .filter(p3)
                .findFirst();

    }
}
