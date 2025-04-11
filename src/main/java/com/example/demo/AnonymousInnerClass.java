package com.example.demo;

public class AnonymousInnerClass {
    interface Greeting {
        void sayHello();
    }

    public static void run() {
        Greeting greet = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from anonymous class!");
            }
        };
        greet.sayHello();
    }
}
