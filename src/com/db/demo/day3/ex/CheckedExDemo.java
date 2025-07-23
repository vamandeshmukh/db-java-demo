package com.db.demo.day3.ex;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExDemo {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            FileReader reader = new FileReader("sample.txt");
            System.out.println(reader.toString());
//        System.out.println(reader.read());
        }
        catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("End");
        }

    }

}
