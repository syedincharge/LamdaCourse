package com.rizvi.streams;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamJoiningExample {
  static String joiningExample(){
      String s = PersonRepository.getAllPersons()
              .stream()
              .map(Person::getName)
            //  .collect(Collectors.joining());
            //  .collect(Collectors.joining("-"));
              .collect(Collectors.joining("-", "[", "]"));
      return s;
  }


    public static void main(String[] args) {

        char[] ch = {'a','b','c','d','e','f','g'};
    //    String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining());
    //    System.out.println("Join Data  :  "+join);

//        String join = Stream.of(ch).map(arr -> new String(arr)).collect(Collectors.joining("-","[","]"));
//        System.out.println("Join Data delimiter :  "+join);

        System.out.println("Joining Data Output :  "+joiningExample());

    }
}
