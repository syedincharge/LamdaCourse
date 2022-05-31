package com.rizvi.lambda;

import java.util.function.Function;

public class FunctionComposeDemo2 {

    public static void main(String[] args) {

        Function<Integer, Integer> function1 = n1 -> n1 + n1;
        Function<Integer, Integer> function2 = n1 -> n1 * n1;

        System.out.println("Function1 andThen Function2  :  "+ function1.compose(function2).apply(10));
    }
}
