package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class LambdaExample {
    public static void run() {
        List<String> list = Arrays.asList("A", "B", "C");
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Item: " + s);
            }
        });
    }
}
