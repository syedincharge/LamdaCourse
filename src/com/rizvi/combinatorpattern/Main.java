package com.rizvi.combinatorpattern;

import java.time.LocalDate;

import static com.rizvi.combinatorpattern.CustomerRegistrationValidator.isEmailValid;

public class Main {

    public static void main(String[] args) {

        Customer customer = new Customer(
                   "Alice",
                "alice@gmail.com",
                "+0321555-1212",
                LocalDate.of(2000,1,1)
        );

      //  System.out.println(new CustomerValidatorService().isValid(customer));

        // using combinator pattern

       CustomerRegistrationValidator.ValidationResult result = isEmailValid()
                .and(CustomerRegistrationValidator.isPhoneNumberValid())
                .and(CustomerRegistrationValidator.isAdult())
                .apply(customer);

        System.out.println(result);

        if(result != CustomerRegistrationValidator.ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
