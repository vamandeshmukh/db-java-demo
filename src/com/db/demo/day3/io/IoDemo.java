package com.db.demo.day3.io;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class IoDemo {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            FileReader reader = new FileReader("sample.txt");
            reader.read();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


        System.out.println("End");
    }
}
