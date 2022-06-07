package com.rizvi.methodreference;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class MethodReferenceExample1 {

    static Function<String, String> f1 = name -> name.toUpperCase();
    static Function<String, String> f2 = String::toUpperCase;

    static Predicate<Person> p1 = person -> person.getHeight() >= 140;
    static Predicate<Person> p2 = MethodReferenceExample1::heightCheck;
    static BiPredicate<Person, Integer> p3 = MethodReferenceExample1::heightCheckWithParam;



    public static void main(String[] args) {
       // System.out.println("Lambda Expression Result  1 : "+f1.apply("syedincharge"));
       // System.out.println("Lambda Expression Result  2 : "+f2.apply("syedincharge"));

        System.out.println("Predicate 1 Result :  "+p1.test(PersonRepository.getPerson()));
        System.out.println("Predicate 2 Result :  "+p2.test(PersonRepository.getPerson()));
        System.out.println("Predicate 3 Result :  "+p3.test(PersonRepository.getPerson(), 165));


    }

    static boolean heightCheck(Person person){
        return person.getHeight() >= 140;
    }
    static boolean heightCheckWithParam(Person person, Integer height){
        return person.getHeight() >= height;
    }
}
