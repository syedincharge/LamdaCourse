package com.rizvi.lambda;

import java.util.function.Function;

public class FunctionDemo {

    public static void main(String[] args) {
        beforeJava8();
        fromJava();

    }

    private static void beforeJava8(){
        Integer usd = 10;
        Double pakValue = convertUsdToPak(usd);
        System.out.println("From beforeJava8 " + usd + "   USD = " + pakValue + " PAK ");
    }
    // User defined method, this functionality is common in most of the java application
    private static Double convertUsdToPak(Integer usd) {
        Double pakRate = 189.20;
        return usd * pakRate;
    }

    private static void fromJava(){

        Double pakRate = 189.20;
        // using a predefined method from Functional Interface
        Function<Integer, Double> function = usd -> usd * pakRate;
        System.out.println("From fromJava8  "+ 10  + " USD  =  " + function.apply(10) + "PAK");
    }


}
