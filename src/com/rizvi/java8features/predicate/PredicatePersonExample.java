package com.rizvi.java8features.predicate;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicatePersonExample {

    static Predicate<Person> p1 = person -> person.getHeight() >= 140;

    static Predicate<Person> p2 = person -> person.getGender().equals("Male");

    public static void main(String[] args) {

        List<Person> personList = PersonRepository.getAllPersons();

        personList.stream()
                .filter(p1)
                .collect(Collectors.toList());

        personList.forEach(person -> {
            if(p1.and(p2).test(person)){
                System.out.println(person);
            }
        });
    }
}
