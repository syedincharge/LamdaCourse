package com.rizvi.java8features.supplier;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class SupplierExample {

    static Supplier<Person> s1 = () -> PersonRepository.getPerson();
    static Supplier<List<Person>> s2 = () -> PersonRepository.getAllPersons();

    public static void main(String[] args) {

      //  List<Person> personList = PersonRepository.getAllPersons();

    //    System.out.println(" Result  1: "+s1.get());
        System.out.println(" Result  2: "+s2.get());
    }
}
