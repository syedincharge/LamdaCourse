package com.rizvi.lambda;

interface HelloWorldInterface{
    public void displayHelloWorld();
}
public class HelloWorldWithLambda {

    public static void main(String[] args) {

        HelloWorldInterface helloWorldInterface = () -> System.out.println("Hello World");
        helloWorldInterface.displayHelloWorld();

    }
}
