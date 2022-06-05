package com.rizvi.java8features.function;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionPersonExample {

    static Function<String, Integer> f1 = name -> name.length();

    static Predicate<Person> p1 = person -> person.getHeight() >= 140;

    static Predicate<Person> p2 = person -> person.getGender().equals("Male");
    static Function<List<Person>, Map<String,Double>> f2 = personList -> {
        Map<String, Double> map = new HashMap<>();

        personList.forEach(person -> {
            if(p1.and(p2).test(person))
            map.put(person.getName(), person.getSalary());
        });
        return map;
    };

    public static void main(String[] args) {

     //   System.out.println(f1.apply("java features"));

        List<Person> personList = PersonRepository.getAllPersons();
       Map<String, Double> map =  f2.apply(personList);
        System.out.println("Result  :  "+map);


    }
}
