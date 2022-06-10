package com.rizvi.streams;



import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

import static com.rizvi.streams._Stream.Gender.*;

public class _Stream {


    public static void main(String[] args) {


        List<Person> people = Arrays.asList(
                new Person("John", MALE),
                new Person("Maria", FEMALE),
                new Person("Aisha", FEMALE),
                new Person("Alex", MALE),
                new Person("Alice", FEMALE));

        people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        Function<Person, String> getPersonStringFunction = person -> person.name;
        ToIntFunction<String> length = String::length;
        IntConsumer println = System.out::println;
        people.stream()
                .map(getPersonStringFunction())
                .mapToInt(length)
                .forEach(println);

        people.stream()
                .map(getPersonStringFunction())
                .collect(Collectors.toSet())
                .forEach(System.out::println);

    }

    private static Function<Person, String> getPersonStringFunction() {
        return person -> person.name;
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}


