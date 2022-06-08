package com.rizvi.optional;

import com.rizvi.java8features.repo.Address;
import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Optional;

public class OptionalMapExample {


    public static void main(String[] args) {
        optionalMapExample();
        optionalFlatMapExample();
        optionalMapFilterExample();
    }

    static void optionalMapExample(){
        Optional<Person> person = PersonRepository.getPersonOptional();
        person.ifPresent(person1 ->{
            String name = person.map(Person::getName).orElse("No Data Found");
            System.out.println("Name  :  "+name);
        });
    }


    static void optionalFlatMapExample(){
        Optional<Person> per = PersonRepository.getPersonOptional();

        if(per.isPresent()){
            String name = per.map(Person::getName).orElse("No Data Found");
            Optional<Address> add = per.flatMap(Person::getAddress);
            System.out.println("Name  :  "+name+"   : " +add.get());
        }
    }


    static void optionalMapFilterExample(){
        Optional<Person> per = PersonRepository.getPersonOptional().filter(person -> person.getHeight() >= 140);
        per.ifPresent(person -> System.out.println(person.getAddress().get()));

    }




}
