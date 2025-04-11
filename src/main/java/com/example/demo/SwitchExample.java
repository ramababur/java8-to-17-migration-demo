package com.example.demo;

public class SwitchExample {
    public static void run() {
        String day = "MONDAY";
        switch (day) {
            case "MONDAY":
                System.out.println("Start of the week");
                break;
            case "FRIDAY":
                System.out.println("End of the week");
                break;
            default:
                System.out.println("Midweek day");
        }
    }
}
