package com.rizvi.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {


    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(1, 2, 3, 4, 5);

        int sum = listOfIntegers.stream().mapToInt(i ->i).sum();
        System.out.println("Sum of ArrayList   : "+sum);
        System.out.println("Array Elements Count  : "+listOfIntegers.stream().mapToInt(i ->i).count());
        System.out.println("Multiply elements in Array : "+listOfIntegers.stream().reduce(1, (a,b) -> a * b));
        System.out.println("Add elements in Array : "+listOfIntegers.stream().reduce(0, (a,b) -> a + b));


    }
}
