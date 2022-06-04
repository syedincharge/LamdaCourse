package com.rizvi.lambda;
import com.rizvi.lambda.StreamProcessTester.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaExercises {

    public static void main(String[] args) {
        exercise1();
        exercise2a();
        exercise2b();
        exercise2c();
        exercise3();
        exercise4();
        exercise5();
    }



    private static void exercise1() {
        //transform this traditional loop by using lambda or method reference
        List<String> list = Arrays.asList("Less ", "is ", "more \n");
        for (String value : list)
            System.out.print(value);
        // solution :
        list.forEach(System.out::println);
        // or:
        list.stream().forEach(value -> System.out.println(value));

    }
        private static void exercise2a() {
            // Exercise the conditions
            // "number is even"
            // "number is positive"
            // "number is zero"
            // and "value is null"
            // by using Predicate<Integer> and, if possible, IntPredicate.
            // Test your predicates with different input.

            Predicate<Integer> isEven = n -> n % 2 == 0;
            System.out.println("Testing :  number is even");
            System.out.println("");
            System.out.println("400 is even : " + isEven.test(400));
            System.out.println("401 is even : " + isEven.test(401));

            System.out.println("");
            System.out.println("Testing : number is positive");

            System.out.println("");
            Predicate<Integer> isPositive = n -> n > 0;
            System.out.println("1 is positive : " + isPositive.test(1));
            System.out.println("-1 is positive : " + isPositive.test(-1));
            System.out.println("0 is positive : " + isPositive.test(0));

            System.out.println("");
            System.out.println("Testing : number is zero");
            System.out.println("");
            Predicate<Integer> isZero = n -> n == 0;
            System.out.println("1 is zero : " + isZero.test(1));
            System.out.println("-1 is zero : " + isZero.test(-1));
            System.out.println("0 is zero : " + isZero.test(0));

            System.out.println("");
            System.out.println("Testing value is null");
            System.out.println("");
            Predicate<Integer> isNull = n -> n == null;
            System.out.println("1 is null : " + isNull.test(1));
            System.out.println("-1 is null : " + isNull.test(-1));
            System.out.println("0 is null : " + isNull.test(0));
            System.out.println("null is null : " + isNull.test(null));


        }
            private static void exercise2b() {
           // express the condition "word is shorter than 5 letters" and test your predicate
                Predicate<String> isShortWord = w -> w.length() < 5;
                System.out.println("");
                System.out.println("Testing word is shorter tha 5 letters");
                System.out.println("");
                System.out.println("123 is shorter than 5 letters : "+isShortWord.test("123"));
                System.out.println("1234 is shorter than 5 letters : "+isShortWord.test("1234"));
                System.out.println("12345 is shorter than 5 letters : "+isShortWord.test("12345"));
                System.out.println("12 is shorter than 5 : "+isShortWord.test("12"));
                System.out.println("123456 is shorter than 5 letters : "+isShortWord.test("123456"));

            }

           private static void exercise2c() {
             // combine  the predicates and test again:
             // "number is positive and even"
             // "number is positive and uneven"

          // solution:
          // copied from above

               Predicate<Integer> isEven = n -> n % 2 == 0;
               Predicate<Integer> isPositive = n -> n > 0;

               Predicate<Integer> isPositiveAndEven = isEven.and(isPositive);
               Predicate<Integer> isPositiveAndUneven =  isEven.negate().and(isPositive);

               System.out.println("");
               System.out.println("Testing : isPositiveAndEven");
               System.out.println("");
               System.out.println("1 isPositiveAndEven : "+isPositiveAndEven.test(1));
               System.out.println("-1 isPositiveAndEven : "+isPositiveAndEven.test(-1));
               System.out.println("12345 isPositiveAndEven : "+isPositiveAndEven.test(12345));
               System.out.println("123456 isPositiveAndEven : "+isPositiveAndEven.test(123456));
               System.out.println("2 isPositiveAndEven : "+isPositiveAndEven.test(2));
               System.out.println("0 isPositiveAndEven : "+isPositiveAndEven.test(0));



               System.out.println("");
               System.out.println("Testing : isPositiveAndUnEven");
               System.out.println("");
               System.out.println("1 isPositiveAndUnEven : "+isPositiveAndUneven.test(1));
               System.out.println("-1 isPositiveAndUnEven : "+isPositiveAndUneven.test(-1));
               System.out.println("12345 isPositiveAndUnEven : "+isPositiveAndUneven.test(12345));
               System.out.println("123456 isPositiveAndUnEven : "+isPositiveAndUneven.test(123456));
               System.out.println("2 isPositiveAndUnEven : "+isPositiveAndUneven.test(2));
               System.out.println("0 isPositiveAndUnEven : "+isPositiveAndUneven.test(0));

    }

    private static void exercise3() {
       // express the conditions "18 years  or older" for the known class person (from the class streamProcessTester)
       // by a) calling getAge() as lambda
       // and b) calling isAdult() aas method reference

      // solutions:
      // a)
      Predicate<Person> is18YearsOrOlderA = p -> p.getAge() >= 18;
      Predicate <Person> is18YearsOrOlderB= Person::isAdult;



      Person person5 = new Person("Bora", 9);
      Person person17 = new Person("Bora", 17);
      Person person18 = new Person("Bora", 18);
      Person person19 = new Person("Bora", 19);



        System.out.println("");
        System.out.println("Testing : is18YearsOrOlderA");
        System.out.println("");
        System.out.println("person5 is18YearsOrOlderA:  "+is18YearsOrOlderA.test(person5));
        System.out.println("person17 is18YearsOrOlderA:  "+is18YearsOrOlderA.test(person17));
        System.out.println("person18 is18YearsOrOlderA:  "+is18YearsOrOlderA.test(person18));
        System.out.println("person18 is18YearsOrOlderA:  "+is18YearsOrOlderA.test(person19));


        System.out.println("");
        System.out.println("Testing : is18YearsOrOlderB");
        System.out.println("");
        System.out.println("person5 is18YearsOrOlderB:  "+is18YearsOrOlderB.test(person5));
        System.out.println("person17 is18YearsOrOlderB:  "+is18YearsOrOlderB.test(person17));
        System.out.println("person18 is18YearsOrOlderB:  "+is18YearsOrOlderB.test(person18));
        System.out.println("person18 is18YearsOrOlderB:  "+is18YearsOrOlderB.test(person19));
    }

    private static void exercise4(){
        // sort a String-List based on the neutral order and print it on the console
        // use lambda and method reference.

        List<String> list = Arrays.asList("D", "B", "E", "C", "Z", "A", "G", "F");

        // solutions :
        list.sort((s1, s2) -> s1.compareTo(s2));
        list.forEach(System.out::print);
        // and
        System.out.println();
        list.sort(String::compareTo);
        list.forEach(System.out::print);
        System.out.println();
    }

    public static void exercise5(){
        // delete from a list of names all those with a short names.
        // use the predicate isShortWord from exercise 2b.
        // use only lambdas (and) or method reference
        // Tip: you canuse the removeIf(Predicate<T> method of the Collection interface

        List<String> list = new ArrayList<>();
        list.add("Bora");
        list.add("BoraBora");
        list.add("Boris");
        list.add("Bo");

        // solutions :

        Predicate<String> isShortWord = w -> w.length() < 5;
        list.removeIf(isShortWord);
        list.forEach(System.out::println);
    }
}
