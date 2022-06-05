package com.rizvi.java8features.consumer;

import com.rizvi.java8features.repo.Person;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerExample {


    public static void main(String[] args) {
       // Consumer<String> con1 = (s) -> {System.out.println(s.toUpperCase());};
      /*  BiConsumer<Integer, Integer> con1 = (a, b) -> System.out.println("Add  :  "+(a+b));
        con1.accept(10, 20);

        List<Integer> list1 = Arrays.asList(new Integer(10), new Integer(10), new Integer(10) );
        List<Integer> list2 = Arrays.asList(new Integer(10), new Integer(10));

        BiConsumer<List<Integer>, List<Integer>> con2 = (l1, l2 ) -> {
            if(l1.size() == l2.size()) System.out.println("True");
            else System.out.println("False");
        };
        con2.accept(list1, list2); */


        BiConsumer<Integer, Integer> addConsumer = (a, b) -> System.out.println("Add  :  "+(a+b));
        BiConsumer<Integer, Integer> substractConsumer = (a, b) -> System.out.println("Subs  :  "+(a-b));
        BiConsumer<Integer, Integer> multiplyConsumer = (a, b) -> System.out.println("Multi  :  "+(a*b));

//        addConsumer.accept(10, 20);
//        subtractConsumer.accept(30, 20);
//        multiplyConsumer.accept(20,20);

        addConsumer.andThen(substractConsumer).andThen(multiplyConsumer).accept(10, 20);
    }
}
