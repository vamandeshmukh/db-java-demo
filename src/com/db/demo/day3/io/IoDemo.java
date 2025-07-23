package com.db.demo.day3.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class IoDemo {

    public static void main(String[] args) {

        System.out.println("Start");

        try {
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);
            String str ;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("End");
    }
}
