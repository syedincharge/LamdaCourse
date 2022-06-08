package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamGroupingExample {

     static void groupByGender(){
       Map<String, List<Person>> groupData =  PersonRepository.getAllPersons()
                 .stream().collect(Collectors.groupingBy(Person::getGender));
     //    groupData.entrySet().forEach(person -> System.out.println("Key :   "+person.getKey()+ "/ Value  : "+person.getValue()));

         Stream.of(groupData).forEach(System.out::println);

     }

     static void groupByHeight(){
         Map<String, List<Person>> groupData = PersonRepository.getAllPersons()
                 .stream().collect(Collectors.groupingBy(person -> person.getHeight() >= 140 ? "Tallest ": "Shortest"));
         Stream.of(groupData).forEach(System.out::println);
     }

    public static void main(String[] args) {

       //  groupByGender();
         groupByHeight();


    }
}
