package com.rizvi.streams.parallel;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class SequentialParallelExample1 {


    public static void main(String[] args) {

   //     System.out.println("Sum from Sequential :  "+sumMethodUsingSeq());
   //     System.out.println("Sum from Parallel  :  "+sumMethodUsingParallel());
        System.out.println("Sum from Seq   :  "+checkPerformance(SequentialParallelExample1::sumMethodUsingSeq, 25));
        System.out.println("Sum from parallel   :  "+checkPerformance(SequentialParallelExample1::sumMethodUsingParallel, 25));

    }

    static long checkPerformance(Supplier<Integer> sum, int numOfTimes){
        long start = System.currentTimeMillis();
        for(int i =0; i < numOfTimes; i++){
            sum.get();
        }

        long end = System.currentTimeMillis();
        return end - start;

    }

    static int sumMethodUsingSeq(){
        return IntStream.rangeClosed(0, 100000000).sum();
    }

    static int sumMethodUsingParallel(){
        return IntStream.rangeClosed(0, 100000000).parallel().sum();
    }
}
