package com.rizvi.lambda;

import java.util.function.Supplier;

public class Video {

    String title;
    String author;

    public Video(String t, String a) {
        title = t;
        author = a;
    }

//    public Video() {
//        this.title = "Default title";
//        this.author = "Default author";
//    }

    @Override
    public String toString() {
        return  title + " by "+ author ;
    }


}


