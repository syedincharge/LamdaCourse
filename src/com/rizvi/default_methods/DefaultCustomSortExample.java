package com.rizvi.default_methods;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;


import java.util.Comparator;
import java.util.List;

public class DefaultCustomSortExample {

    static Comparator<Person> c1 = Comparator.comparing(Person::getName);
    static Comparator<Person> c2 = Comparator.comparing(Person::getHeight);

    public static void main(String[] args) {

        List<Person> listOfPersons = PersonRepository.getAllPersons();
        System.out.println("####################################  sortByName      ##################################################");
        sortByName(listOfPersons);
        System.out.println("####################################   sortByHeight     #############################################");
        sortByHeight(listOfPersons);
        System.out.println("#####################################   sortByHeightAndName     #########################################");
        sortByHeightAndName(listOfPersons);
        System.out.println("#####################################  sortByNameWithNullFirst  ##############################################");
        sortByNameWithNull(listOfPersons);
        System.out.println("#####################################   sortByNameWithNullLast   ##########################################");
        sortByNameWithNullLast(listOfPersons);
    }
    static void sortByName(List<Person> listOfPersons){
        listOfPersons.sort(c1);
        listOfPersons.forEach(person -> System.out.println(person));
    }

    static void sortByHeight(List<Person> listOfPersons){
        listOfPersons.sort(c2);
        listOfPersons.forEach(person -> System.out.println(person));
    }

    static void sortByHeightAndName(List<Person> listOfPersons){
        listOfPersons.sort(c1.thenComparing(c2));
        listOfPersons.forEach(person -> System.out.println(person));
    }

    static void sortByNameWithNull(List<Person> listOfPersons){
        Comparator<Person> nullComp = Comparator.nullsFirst(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));

    }

    static void sortByNameWithNullLast(List<Person> listOfPersons){
        Comparator<Person> nullComp = Comparator.nullsLast(c1);
        listOfPersons.sort(nullComp);
        listOfPersons.forEach(per -> System.out.println(per));

    }
}
