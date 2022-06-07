package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.function.Predicate;

public class StreamMapFilterReduceExample {

    static Predicate<Person> p1 = (person) -> person.getHeight() >= 140;
    static Predicate<Person> p2 = (person) -> person.getGender().equals("Male");


    public static void main(String[] args) {
       int kidsCount = PersonRepository.getAllPersons()
                .stream()
               .filter(p1.and(p2))
                .map(Person :: getKids)
              //  .reduce(0, Integer :: sum);
                      .reduce(0, (x,y) -> (x + y));
        System.out.println("Number Of Total Kids  :  "+kidsCount);


    }
}
