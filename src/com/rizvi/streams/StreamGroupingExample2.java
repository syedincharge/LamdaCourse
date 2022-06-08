package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;
public class StreamGroupingExample2 {


    static void twoLevelGrouping(){
       Map<String, Map<String, List<Person>>> groupedData = PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(Person::getGender, groupingBy(person -> person.getHeight() >= 140 ? "Tallest" : "Shortest")));
        Stream.of(groupedData).forEach(System.out::println);
    }

    static void twoLevelGroupingCount(){

       Map<String, Integer> groupedData =  PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(Person::getName, summingInt(Person::getKids)));
        Stream.of(groupedData).forEach(System.out::println);
    }

    static void threeLevelGrouping(){

        Map<String, List<Person>> groupedData =  PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.groupingBy(Person::getName, HashMap:: new, Collectors.toList()));
          Stream.of(groupedData).forEach(System.out::println);
    }
    public static void main(String[] args) {

      //  twoLevelGrouping();
      //  twoLevelGroupingCount();
        threeLevelGrouping();
    }
}
