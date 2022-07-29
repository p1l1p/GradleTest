package com.gradletest;

import org.joda.time.DateTime;

public class Main {
    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        System.out.print("Hello World! It's " + dateTime.year().getAsShortText() + "!");
    }
}