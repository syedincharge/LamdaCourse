package com.rizvi.optional;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Optional;

public class OptionalExample {


    public static void main(String[] args) {

       // System.out.println("Result :  "+myName("John Doe"));
        Optional<String> name = Optional.ofNullable(myName("John Doe"));
        //String name1 = Optional.ofNullable(myName("John Doe")).get();
      //  System.out.println(name.isPresent() ? name.get() : "No Data Found");

     //   System.out.println("Person Name  : "+personName(new Person()));
        Optional<String> personname = personNameWithOptional(PersonRepository.getPersonOptional());
        System.out.println("The Optional Person is  :  "+personname.get());
    }

    static String myName(String name){

        return name;
    }

    static String personName(Person person){
        if(person != null)
            return person.getName();
        else
            return "No Data Found";
    }

    static Optional<String> personNameWithOptional(Optional<Person> person){
        if (person.isPresent())
            return person.map(Person::getName);
        else
            return Optional.empty();
    }
}

