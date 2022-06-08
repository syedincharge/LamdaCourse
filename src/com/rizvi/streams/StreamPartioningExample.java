package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;
import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamPartioningExample {

    static Predicate<Person> p1 = person -> person.getHeight() >= 110;


   static void byHeight(){

    Map<Boolean, List<Person>> map =  PersonRepository.getAllPersons()
               .stream()
               .collect(partitioningBy(p1));
       System.out.println("Person Map 1 : "+map);
   }

    static void byHeightBy2Param(){

        Map<Boolean, Set<Person>> map =  PersonRepository.getAllPersons()
                .stream()
                .collect(partitioningBy(p1, Collectors.toSet()));
        System.out.println("Person Map 2 : "+map);
    }

    static void byHeightWithMap(){

        Map<Boolean, Map<String, List<String>>> map =  PersonRepository.getAllPersons()
                .stream()
                .collect(partitioningBy(p1, Collectors.toMap(Person::getName, Person::getHobbies)));
        System.out.println("Person Map 3 : "+map);
    }

    public static void main(String[] args) {
    //    byHeight();
    //    byHeightBy2Param();
        byHeightWithMap();
    }
}
