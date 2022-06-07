package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Optional;

public class StreamReduceExample1 {


    public static void main(String[] args) {
        combinedNames();
        Optional<Person> tallestPerson = getTallestPerson();
        System.out.println("Tallest Person is  : " + tallestPerson.get()
        );



    }

    private static void combinedNames() {
        String names = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getName)
                .reduce("", (a, b) -> a.concat(b));
        System.out.println("Names are :  " + names);
    }

    static Optional<Person> getTallestPerson() {
        return PersonRepository.getAllPersons()
                .stream()
                .reduce((x, y) -> x.getHeight() > y.getHeight() ? x : y);


    }
}
