package com.rizvi.java8features.predicate;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("// Normal Java without Predicate");
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println(isPhoneNumberValid("09000000000"));
        System.out.println(isPhoneNumberValid("070000"));
        System.out.println(isPhoneNumberValid("07000000000"));
        System.out.println("// With Predicate ");
        System.out.println(isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("09000000000"));
        System.out.println(isPhoneNumberValidPredicate.test("070000"));
        System.out.println(isPhoneNumberValidPredicate.test("07000000300"));
        System.out.println("//  with two Predicate inputs method");
        System.out.println("Is Phone number valid and contains number 3 =  "+isPhoneNumberValidPredicate.and(containsNumber3).test("09000000300"));
        System.out.println("Is Phone number valid and contains number 3 =  "+isPhoneNumberValidPredicate.and(containsNumber3).test("07000000003"));
        System.out.println("Is Phone number valid and contains 11 numbers or number 3 =  "+isPhoneNumberValidPredicate.or(containsNumber3).test("07000000000"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }
    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber ->
            phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
