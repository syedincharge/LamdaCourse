package com.rizvi.optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {


         Optional.ofNullable(null )
                 .ifPresentOrElse(email -> System.out.println("Sending Email to "+email),
                         ()->{ System.out.println("Cannot Send Email");});

    }
}
