package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionIteration {
    public static void run() {
        List<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Bob");

        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            String name = it.next();
            System.out.println("Name: " + name);
        }
    }
}
