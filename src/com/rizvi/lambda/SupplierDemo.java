package com.rizvi.lambda;

import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Video> s1 = () -> new Video("Java SE 11 1z0-817 upgrade exam video series " , "Syed");
       // Supplier<Video> s1 = Video::new;
      //  Supplier<Video> s2 = () -> {return  new Video("Oracle Certified JEE 8 Exam preparation video series ", "Syed");};


        System.out.println(s1.get()); // since get returns T  and T is a type of video ==>
      //  System.out.println(s2.get()); // if a video is to be printed using println, the to String() method is called
    }
}
