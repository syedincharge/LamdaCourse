package com.rizvi.default_methods;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class DefaultMethodExample {


    public static void main(String[] args) {

        List<String> nameList = PersonRepository.getAllPersons()
                .stream().map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("############  Before Sort  #############");
        nameList.forEach(name -> System.out.println(name));
        System.out.println("############  After  Sort  #############");
        Collections.sort(nameList);
        nameList.forEach(name -> System.out.println(name));
        System.out.println("############  Comparator with Natural Order  #############");
        nameList.sort(Comparator.naturalOrder());
        nameList.forEach(name -> System.out.println(name));
        System.out.println("############  Comparator with Reverse Order  #############");
        nameList.sort(Comparator.reverseOrder());
        nameList.forEach(name -> System.out.println(name));
    }
}
