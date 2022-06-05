package com.rizvi.java8features.consumer;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerPersonExample {


    static void printPersonDetails(){
        BiConsumer<String, List<String>> personConsumer = (name, hobbies) -> System.out.println(""+name+"  "+hobbies);
        BiConsumer<String, Double> salaryConsumer = (name, salary) -> System.out.println(""+name+"  "+salary);

        List<Person> personList = PersonRepository.getAllPersons();

     //   personList.forEach(person -> personConsumer.accept(person.getName(), person.getHobbies()));
        personList.forEach(person -> {personConsumer.accept(person.getName(), person.getHobbies());
          salaryConsumer.accept(person.getName(), person.getSalary());
       });
    }
    public static void main(String[] args) {

        printPersonDetails();

    }
}
