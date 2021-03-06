package com.rizvi.lambda;

import java.util.function.Function;

public class FunctionComposeDemo1 {

    public static void main(String[] args) {

        Function<String, String> function1 = s -> s.toUpperCase();
        Function<String, String> function2 = s -> s + "  World";

        System.out.println("Output  -  function1 : "+ function1.apply("Hello"));

        System.out.println("Output  - Compose  "+ function1.compose(function2).apply("Hello"));
        // The Output of the first Function will become input to the second Function
    }
}
