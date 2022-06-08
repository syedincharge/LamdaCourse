package com.rizvi.streams.parallel;

import com.rizvi.java8features.repo.Person;
import com.rizvi.java8features.repo.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamUseCase {


    public static void main(String[] args) {

        getHobbiesBySeq();
        System.out.println("##################################");
        getHobbiesByParallel();

    }


    static List<String> getHobbiesBySeq(){
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .stream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Sequential Duration  :  "+(end - start));
        return hobbies;
    }

    static List<String> getHobbiesByParallel(){
        long start = System.currentTimeMillis();
        List<String> hobbies = PersonRepository.getAllPersons()
                .parallelStream()
                .map(Person::getHobbies)
                .flatMap(List::stream)
                .collect(Collectors.toList());
        long end = System.currentTimeMillis();
        System.out.println("Parallel Duration  :  "+(end - start));
        return hobbies;
    }
}
