package com.db.demo.day1.cli;

public class CommandLineDemo {

    public static void main(String[] args) {
        System.out.println("Command Line Arguments Demo");

        if (args.length > 0) {
            for (String str : args) {
                System.out.println(str);
            }
        }
        System.out.println("End");

    }

}
