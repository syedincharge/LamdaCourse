package com.rizvi.java8features.repo;

import java.util.Arrays;
import java.util.List;

public class PersonDetailImpl implements  PersonDetails {
    @Override
    public double calculateTotalSalary(List<Person> personList) {
        return personList.stream().map(Person::getSalary).reduce(0d, (x, y) -> (x + y));
    }

    public int totalKids(List<Person> personList) {
        return (20 + 10);
    }

    static List<String> personNames(List<Person> personList){
        return Arrays.asList("One", "Two","Three");
    }
}