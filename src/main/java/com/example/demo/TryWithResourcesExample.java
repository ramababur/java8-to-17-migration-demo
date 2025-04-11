package com.example.demo;

import java.io.*;

public class TryWithResourcesExample {
    public static void run() {
        InputStream inputStream = null;
        BufferedReader reader = null;
        try {
            inputStream = TryWithResourcesExample.class.getClassLoader().getResourceAsStream("sample.txt");

            if (inputStream == null) {
                System.out.println("File not found in resources.");
                return;
            }

            reader = new BufferedReader(new InputStreamReader(inputStream));

            System.out.println(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (inputStream != null) inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
