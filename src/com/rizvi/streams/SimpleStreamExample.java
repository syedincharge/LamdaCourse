package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimpleStreamExample {


    public static void main(String[] args) {
      /*
        Stream<Integer>  s1 = Stream.of(1,2,3,4,5,6);
        s1.forEach(p -> System.out.println(p));
        System.out.println("###############################");
        Stream<Integer>  s2 = Stream.of(new Integer[] {1,2,3,4,5,6,});
        s2.forEach(p -> System.out.println(p)); */

        Predicate<Person> p1 = (person -> person.getHeight() >= 145);
        Predicate<Person> p2 = (person -> person.getGender() .equals("Male"));

        Map<String, List<String>> personMap = PersonRepository
                .getAllPersons() // iterate all persons
                .stream()  // Stream of Persons
                .filter(p1) // Stream of Persons
                .filter(p2)  // Stream of Persons
                .collect(Collectors.toMap(Person::getName, Person::getHobbies));
        System.out.println("Person Map : "+personMap);

        List<String> personHobbies = PersonRepository
                .getAllPersons() // List of Persons
                .stream()  // Stream of Persons
                .map(Person::getHobbies) // Stream <List<String>>
                .flatMap(List::stream) // Stream<String>
                .distinct() // duplication removed by distinct
                .collect(Collectors.toList()); // Collections to be returned

        System.out.println("Person Hobbies List :  "+personHobbies);

    }
}
