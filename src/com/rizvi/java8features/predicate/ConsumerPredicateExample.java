package com.rizvi.java8features.predicate;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ConsumerPredicateExample {

    static Predicate<Person> p1 = person -> person.getHeight() >= 140;

    static Predicate<Person> p2 = person -> person.getGender().equals("Male");

    static BiPredicate<Integer, String> p3 = (height, gender) -> height >= 140 && gender.equals("Male");

   static  BiConsumer<String, List<String>> hobbiesConsumer = (name, hobbies) -> System.out.println(""+name+"  "+hobbies);

  static Consumer<Person> personConsumer = person -> {
    //    if(p1.and(p2).test(person)){
      if(p3.test(person.getHeight(), person.getGender())){
            hobbiesConsumer.accept(person.getName(), person.getHobbies());
        }
    };


    public static void main(String[] args) {

        List<Person> personList = PersonRepository.getAllPersons();
        personList.forEach(personConsumer);

    }
}
