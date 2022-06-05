package com.rizvi.java8features.unary;

import java.util.Comparator;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class UnaryBinaryExample {

    static UnaryOperator<String> uo1 = name -> name.toUpperCase();
    static UnaryOperator<Integer> uo2 = a -> a+10;
    static Comparator<Integer> comp = (a, b) ->a.compareTo(b);
  //  static BinaryOperator<Integer>

    public static void main(String[] args) {
    //    System.out.println("Result 1 :  "+uo1.apply("java8" ));
    //    System.out.println("Result 1 :  "+uo2.apply(25 ));

        BinaryOperator<Integer> bo1 = BinaryOperator
                .maxBy((a,b) -> (a>b) ?1:(a==b)?0:-1);
        System.out.println("Binary Operator Result MaxBY :  "+bo1.apply(12,15));

        BinaryOperator<Integer> bo2 = BinaryOperator
                .maxBy(comp);
        System.out.println("Binary Operator Result MaxBY" +
                " :  "+bo1.apply(120,15));

        BinaryOperator<Integer> bo3 = BinaryOperator
                .minBy(comp);
        System.out.println("Binary Operator Result MinBy" +
                " :  "+bo3.apply(120,15));

    }
}
