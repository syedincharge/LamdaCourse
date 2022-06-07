package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamSumAndAverageExample {

    static int sumTotalKids(){
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.summingInt(Person::getKids));
    }

    static double averageHeight(){
        return PersonRepository.getAllPersons()
                .stream()
                .collect(Collectors.averagingInt(Person::getHeight));
    }

    public static void main(String[] args) {

        System.out.println("Total Number of Kids :  "+sumTotalKids());
        System.out.println("Average Heights :  "+averageHeight());

        List<Integer> intList = Arrays.asList(1,2,3,4,5,6);
        int Total = intList.stream().collect(Collectors.summingInt(Integer :: intValue ));
        System.out.println("total Value  : "+Total);

    }
}
