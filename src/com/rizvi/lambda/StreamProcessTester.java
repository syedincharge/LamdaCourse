package com.rizvi.lambda;

import javax.naming.Name;

public class StreamProcessTester {

static class Person {


    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(){
        this.name = name;;
    }

    public int getAge() {
        return age;
    }
    public void setAge(){
        this.age = age;
    }
   public boolean isAdult(){
        if(age >= 18)
            return  true;
        else
            return false;
   }



}
}
