package com.rizvi.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        List<Integer> javaVersionList = new ArrayList<>();
        javaVersionList.add(7);
        javaVersionList.add(8);
        javaVersionList.add(9);
        javaVersionList.add(10);
        javaVersionList.add(11);
        javaVersionList.add(12);

        beforeJava8(javaVersionList);
        fromJava8(javaVersionList);
     }

     private static void beforeJava8(List<Integer> javaVersionList){

        List<Integer> evenList = new ArrayList<>(); // temp List
         for (Integer javaVersion : javaVersionList){
             if(javaVersion % 2 == 0){
                 evenList.add(javaVersion);
             }
         }
         System.out.println("beforeJava8 Java Version evenList  "+evenList);
     }


     private static void fromJava8(List<Integer> javaVersionList){
          // create a Stream from Collection(List)
     //   Stream<Integer> javaVersionStream = javaVersionList.stream(); // List --> Stream
         List<Integer> evevJavaVersionList =
         javaVersionList
                 .stream().filter(javaVersion -> javaVersion % 2 == 0)
                 .collect(Collectors.toList());
         // Stream is used for processing object from collections, processing means filtering whic is an intermediate operation on stream
       // Stream<Integer> evenJavaVersionList = javaVersionStream.filter(javaVersion -> javaVersion % 2 == 0); // Output type is stream of evenList
         // collect is a terminal operation
       // List<Integer> evevJavaVersionList = evenJavaVersionList.collect(Collectors.toList());

        //             Or (We can traverse Stream only once, if we run both, it will
        // Set<Integer> evevJavaVersionSet = evenJavaVersionStream.collect(Collectors.toSet());

         System.out.println("fromjava8 javaVersionEvenList  : " +evevJavaVersionList);

      //   System.out.println("fromjava8 javaVersionEvenList  : " +evevJavaVersionSet);

     // javaVersionList.stream().filter(javaVersionEvenList -> javaVersionEvenList % 2 == 0).collect(Collectors.toList());

     }


}
