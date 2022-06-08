package com.rizvi.optional;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Optional;

public class OptionalMethodsExample2 {


    public static void main(String[] args) {
        orElse();
        orElseGet();
        orElseThrow();


    }

    static void orElse(){
        Optional<Person> person = PersonRepository.getPersonOptional();
      //  String name = person.isPresent() ? person.get().getName() : "Data Not Found";
        String name = person.map(Person::getName).orElse("No Data Found");
        System.out.println("OrElse Person Name : "+name);
     }

    static void orElseGet(){
        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseGet(() -> {
            // to send a notification mail
            // Initiate any script
            return  "Data Not Found";
        });
        System.out.println("OrElseGet Person Name : "+name);
    }


    static void orElseThrow(){
        Optional<Person> person = PersonRepository.getPersonOptional();
        String name = person.map(Person::getName).orElseThrow(() -> new RuntimeException("Name Not Found"));
        System.out.println("OrElseThrow Person Name : "+name);
    }



}
