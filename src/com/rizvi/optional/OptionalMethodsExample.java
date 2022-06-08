package com.rizvi.optional;

import java.util.Optional;

public class OptionalMethodsExample {


    public static void main(String[] args) {
     // Optional<String> ofNullable = Optional.of("java8");
        Optional<String> ofNullable = Optional.ofNullable("java8");
     // Optional<String> ofNullable = Optional.ofNullable(null);
        System.out.println("Result : "+Optional.empty());
        System.out.println("Result of Nullable :"+(ofNullable.isPresent() ? ofNullable.get() : Optional.empty()));

        Optional<String>of = Optional.of("Hello");
        System.out.println("Result of :"+(of.isPresent() ? of.get() : Optional.empty()));


    }


}
