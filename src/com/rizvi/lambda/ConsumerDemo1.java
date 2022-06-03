package com.rizvi.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerDemo1<T extends Object> {
    public void processList(List<T> list , Consumer<T> cons){
        for (T s  : list) {
          cons.accept(s);
        }
    }

    public static void main(String[] args) {
        List<String> l = Arrays.asList(new String[] {"Lambdas", "are", "anonymous", "method", "!" });
        Consumer<String> c = s -> System.out.print(String.format("%s ", s)); // here consumer is target type
        new ConsumerDemo1<String>().processList(l, c);
    }
}
