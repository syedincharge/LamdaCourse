package com.rizvi.java8features.repo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class PersonRepository {

    public static List<Person> getAllPersons(){
        Person p1 = new Person("John",165, 2000, "Male",2, Arrays.asList("Cricket", "Swimming", "Tennis"));
        Person p2 = new Person("Angela",158, 5500, "Female",1, Arrays.asList("Cooking", "Sewing", "Table Tennis"));
        Person p3 = new Person("Dean",140, 5700, "Male",5, Arrays.asList("Football", "BasketBall", "Ice Hockey"));
        Person p4 = new Person("Nancy",130, 4900, "Female",3, Arrays.asList("Hockey", "Swimming", "Tennis"));
        Person p5 = new Person("Hillary",125, 9000, "Female",2, Arrays.asList("Flying", "Soccer", "Tennis"));
        Person p6= new Person("Alan",110, 2500, "Male",4, Arrays.asList("Rafting", "Swimming", "Hiking"));
        Person p7= new Person("Campbell",165, 2500, "Male",3, Arrays.asList("Squash", "Swimming", "Biking"));

        return Arrays.asList(p1, p2, p3, p4, p5, p6, p7);
    }

    public static  Person getPerson(){
        return new Person("John",165, 2000, "Male",2, Arrays.asList("Cricket", "Swimming", "Tennis"));
    }

    public static Optional<Person> getPersonOptional(){
        Person per = getPerson();
        per.setAddress(Optional.of(new Address("7th Block", "Ashton","Virginia", "USA", 20478)));
        return Optional.of(per);
    }


}
