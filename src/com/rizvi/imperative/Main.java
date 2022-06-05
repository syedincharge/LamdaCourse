package com.rizvi.imperative;



import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

      // Imperative and Declarative programming styles
        List<Employee> employees = Arrays.asList(
         new Employee("John", Gender.MALE),
         new Employee("Maria", Gender.FEMALE),
         new Employee("Aisha", Gender.FEMALE),
         new Employee("Alice", Gender.FEMALE),
                new Employee("Alex", Gender.MALE));

        System.out.println("// Imperative approach");
        // Imperative approach
        List<Employee> females = new ArrayList<>();

        for(Employee employee : employees){
           if(Gender.FEMALE.equals(employee.gender)){
              females.add(employee);
           }
        }
        for(Employee female : females){
            System.out.println(female);
            }

        System.out.println("// Declarative approach");
        // Declarative approach
        List<Employee> females2 = employees.stream()
                .filter(employee -> Gender.FEMALE.equals(employee.gender))
               // .collect(Collectors.toList())
               // .forEach(System.out::println);
                .collect(Collectors.toList());
                females2.forEach(System.out::println);

    }


    static class Employee{
        private final String name;
        private final Gender gender;

        Employee(String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE,FEMALE
    }
}
