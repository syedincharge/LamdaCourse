package com.rizvi.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFlatMapExample {


    public static void main(String[] args) {

        List<Integer> oddNumbers = Arrays.asList(1, 3, 5, 7);
        List<Integer> evenNumbers = Arrays.asList(2, 4, 6, 8);

        List<List<Integer>> listOfList = Arrays.asList(oddNumbers, evenNumbers);

        System.out.println("Before Flatten  : "+listOfList);

        List<Integer> flattenList = listOfList.stream()
                .flatMap(list -> list.stream())
                .collect(Collectors.toList());

        System.out.println("After Flatten  : "+flattenList);
    }
}
