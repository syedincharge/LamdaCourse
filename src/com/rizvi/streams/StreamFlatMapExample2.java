package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamFlatMapExample2 {


    static List<String> hobbies(List<Person> personList){
        return personList.stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
    }
    static List<String> distinctHobbies(List<Person> personList){
        return personList.stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    static List<String> hobbiesSorted(List<Person> personList){
        return personList.stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .sorted()
                .distinct()
                .collect(Collectors.toList());
    }
    static Set<String> hobbiesSet(List<Person> personList){
        return personList.stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {


        System.out.println("List Of Hobbies wit Duplicates: "+hobbies(PersonRepository.getAllPersons()));
        System.out.println("List Of Hobbies Without Duplicates: "+distinctHobbies(PersonRepository.getAllPersons()));
        System.out.println("List Of Hobbies With SortedMethod: "+hobbiesSorted(PersonRepository.getAllPersons()));
        System.out.println("List Of Hobbies With SortedSet: "+hobbiesSet(PersonRepository.getAllPersons()));

    }
}
