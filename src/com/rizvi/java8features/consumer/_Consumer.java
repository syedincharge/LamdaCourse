package com.rizvi.java8features.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {

    public static void main(String[] args) {

        // Normal Java function
        Customer maria = new Customer("Maria", "555-1212");
        greetCustomer(maria);
        greetCustomerV2(maria, false);

        // Consumer Functional Interface
        greetConsumerCustomer.accept(maria);

        // BiConsumer Functional Interface
        greetConsumerCustomerV2.accept(maria, false);

    }

    static BiConsumer<Customer, Boolean> greetConsumerCustomerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello  "+customer.customerName  +
                    " , thanks for  registering phone number "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "***********"));
    static Consumer<Customer> greetConsumerCustomer = customer ->
            System.out.println("Hello  "+customer.customerName  +
                    " , thanks for  registering phone number "
                    +customer.customerPhoneNumber);

    static void greetCustomerV2(Customer customer, boolean showPhoneNumber){
        System.out.println("Hello  "+customer.customerName  +
                " , thanks for  registering phone number "
                + (showPhoneNumber ? customer.customerPhoneNumber : "***********"));
    }

    static void greetCustomer(Customer customer){
        System.out.println("Hello  "+customer.customerName  +
                " , thanks for  registering phone number "
                +customer.customerPhoneNumber);
    }

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }


    }
}
