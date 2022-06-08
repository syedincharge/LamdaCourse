package com.rizvi.java8features.repo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class PersonDetailClient {

    public static void main(String[] args) {

        List<Person> listOfPersons = PersonRepository.getAllPersons();

    PersonDetails personDetails = new PersonDetailImpl();
        System.out.println("Total  Salary   :  "+personDetails.calculateTotalSalary(listOfPersons));
        System.out.println("Total Kids Count :  "+personDetails.totalKids(listOfPersons));
        PersonDetails.personNames(listOfPersons).forEach(System.out::println);
        PersonDetailImpl.personNames(listOfPersons).forEach(System.out::println);
     }
}
