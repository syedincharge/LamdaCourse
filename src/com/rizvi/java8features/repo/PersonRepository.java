package com.rizvi.java8features.repo;

import java.util.Arrays;
import java.util.List;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("John",165, 2000, "Male",2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Person p2 = new Person("Angela",158, 5000, "Female",1, Arrays.asList("Cooking", "Sewing", "Table Tennis"));
        Person p3 = new Person("Dean",145, 5700, "Male",5, Arrays.asList("Football", "BasketBall", "Ice Hockey"));
        Person p4 = new Person("Nancy",125, 3500, "Female",3, Arrays.asList("Hockey", "Swimming", "Tennis"));
        Person p5 = new Person("Hillary",120, 9000, "Female",2, Arrays.asList("Flying", "Soccer", "Tennis"));
        Person p6= new Person("Alan",135, 8500, "Male",4, Arrays.asList("Rafting", "Swimming", "Hiking"));

        return Arrays.asList(p1, p2, p3, p4, p5, p6);
    }

    public static  Person getPerson(){
        return new Person("John",165, 2000, "Male",2, Arrays.asList("Cricket", "Swimming", "Tennis"));
    }
}
