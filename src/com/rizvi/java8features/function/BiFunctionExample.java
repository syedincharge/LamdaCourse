package com.rizvi.java8features.function;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<String, String, String> biFunc1  = (a, b) -> (a+" "+b);
    static Predicate<Person> p1 = person -> person.getHeight() >= 140;
    static Predicate<Person> p2 = person -> person.getGender().equals("Male");
    static BiFunction<List<Person>, Predicate<Person>, Map<String,Double>> bifunc2 =
            (listOfPersons, predicate) -> {
                Map<String, Double> map = new HashMap<>();
                listOfPersons.forEach(person -> {
                    if(p1.and(predicate).test(person))
                        map.put(person.getName(), person.getSalary());
                });
              return map;
            };

    public static void main(String[] args) {
        System.out.println("Result 1 : "+biFunc1.apply("java8", "features").toUpperCase());
        List<Person> personList = PersonRepository.getAllPersons();
        Map<String, Double> map = bifunc2.apply(personList, p2);
        System.out.println("Result 2 :  "+map);

    }
}
