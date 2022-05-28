package com.rizvi.lambda;

interface DebugLambdaInterface {
    public int sumOfTwoNumbers(int a, int b);
}


public class DebugLambdaInterfaceExpression {

    public static void main(String[] args) {

        System.out.println("Start Main Method");
        DebugLambdaInterface debugLambda = (a, b) -> {
            System.out.println("Inside Lambda Expression");
            int sum = a + b;
            return sum;
        };

        System.out.println("Before calling adTwoNumbers Method");
        addTwoNumbers(debugLambda);
        System.out.println("After Calling  addTwoNumbers Method");
        System.out.println("End Main Method");

    }

    private static void addTwoNumbers(DebugLambdaInterface debugLambda) {
        System.out.println("Start addTwoNumbers");
        System.out.println("Sum of two numbers  : " + debugLambda.sumOfTwoNumbers(100, 200));
        System.out.println("End addTwoNumbers");
    }
}
