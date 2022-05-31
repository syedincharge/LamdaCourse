package com.rizvi.lambda;

import java.util.function.Consumer;

public class ConsumerDemo2 {
    public static void main(String[] args) {

        Consumer<String> consumer = message -> EmailUtility.sendEmail(message);
        consumer.accept("Your Account has been created");
    }

}

class EmailUtility{
    public static void sendEmail(String message){
        // to
        // Cc
        // Subject
        // Message Body
        // sendEmail();

        System.out.println("Successfully Sent an email with the message \n"+ message);
    }
}
