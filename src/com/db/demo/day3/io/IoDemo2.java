package com.db.demo.day3.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoDemo2 {

    public static void main(String[] args) {

        System.out.println("Start");

        try (
                FileReader reader = new FileReader("sample.txt");
                BufferedReader br = new BufferedReader(reader);
                FileWriter writer = new FileWriter("output.txt");
                BufferedWriter bw = new BufferedWriter(writer);
        ) {
            String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
                bw.write(str);
                bw.newLine();
            }

            System.out.println("File copied successfully.");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("End");
    }
}
