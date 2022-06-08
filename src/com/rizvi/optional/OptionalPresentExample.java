package com.rizvi.optional;

import java.util.Optional;

public class OptionalPresentExample {


    public static void main(String[] args) {

        Optional<String> ofNullable = Optional.ofNullable("java8");
        System.out.println("Result of Nullable :"+(ofNullable.isPresent() ? ofNullable.get() : Optional.empty()));
        ofNullable.ifPresent(s -> System.out.println(s));
    }
}
