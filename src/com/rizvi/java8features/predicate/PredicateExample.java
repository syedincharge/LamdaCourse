package com.rizvi.java8features.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<Integer> lessThan = a -> (a <= 50);
        Predicate<Integer> greaterThan = a -> (a >= 100);
        Predicate<Integer> equalTo = a -> (a == 0);

//        boolean result1 = lessThan.test(150);
//        boolean result2 = greaterThan.test(150);
//        boolean result3 = equalTo.test(0);
//
//        System.out.println("Result 1 : "+result1);
//        System.out.println("Result 2 : "+result2);
//        System.out.println("Result 3 : "+result3);

        System.out.println("GreaterThan : "+greaterThan.test(150));
        System.out.println("LessThan : "+lessThan.test(150));
        System.out.println("EqualTo : "+equalTo.test(0));

        boolean result1 = lessThan.and(greaterThan).and(equalTo).test(150);
        System.out.println("Result 1 : "+result1);

        boolean result2 = lessThan.or(greaterThan).test(150);
        System.out.println("Result 2 : "+result2);

        boolean result3 = lessThan.or(greaterThan).negate().test(150);
        System.out.println("Result 3 : "+result3);





    }
}
