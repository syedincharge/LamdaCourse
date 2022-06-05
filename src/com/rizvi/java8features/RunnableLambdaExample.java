package com.rizvi.java8features;

public class RunnableLambdaExample {
    public static void main(String[] args) {
        // Before
        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 1");
            }
        };
        new Thread(t1).start();

        // After java 8
        Runnable t2 = () -> {System.out.println("Thread 2");};
        new Thread(t2).start();

        Runnable t3 = () -> {System.out.println("Thread 3");
            System.out.println("Thread 3.1");
        };
        new Thread(t3).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 4");
            }
        }).start();

        new Thread(() -> System.out.println("Thread 5")).start();
        new Thread(() -> {System.out.println("Thread 6");
            System.out.println("Thread 7");
            System.out.println("Thread 8");
            System.out.println("Thread 9");
            System.out.println("Thread 10");

        }).start();
    }

}
