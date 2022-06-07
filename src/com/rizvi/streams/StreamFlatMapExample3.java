package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;

public class StreamFlatMapExample3 {

    static long countOfHobbies(List<Person> personList){
        return personList.stream()
                .map(Person :: getHobbies)
                .flatMap(List :: stream)
                .distinct()
                .count();
    }

    public static void main(String[] args) {

        System.out.println("Hobbies Count  : "+countOfHobbies(PersonRepository.getAllPersons()));
    }
}
