package com.db.demo.day3.cast;

public class CastDemo {

    public static void main(String[] args) {
        // byte short int char long
        // byte short int char == int

        byte b1 = 10;
        byte b2 = 20;
        int b3 = b1 + b2;
        byte b4 = (byte) (b1 + b2);
//        System.out.println(b3);
//        System.out.println(b4);

        int num = 10;
        char ch = 'a';
        System.out.println(num + ch);
        String grade = "A";

    }

}
