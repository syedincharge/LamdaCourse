package com.rizvi.lambda;

interface HelloInterface{
    public void displayHello();
}
public class HelloWithLambda {

    public static void main(String[] args) {
        HelloInterface helloInterface = () -> System.out.println("Hello");
        helloInterface.displayHello();
    }
}
