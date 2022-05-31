package com.rizvi.lambda;

import java.util.function.Function;

public class FunctionAndThenDemo {
    public static void main(String[] args) {

        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s + "  World";

        System.out.println("Output of function1 : "+ function1.apply("Hello"));

        System.out.println("andThen Output  :  "+ function1.andThen(function2).apply("Hello"));
    }
}
