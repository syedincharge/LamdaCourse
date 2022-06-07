package com.rizvi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {


    public static void main(String[] args) {

        List<String> fruits  =  Arrays.asList("Apple","Orange","Banana", "Pineapple");
        List<Integer> fruitsLength = fruits.stream()
                .map(String::length)
                .collect(Collectors.toList());

       // System.out.println("Length of fruits : "+fruitsLength);

        fruits.stream()
                .map(String::length)
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Length of fruits : "+fruitsLength);
    }

}
