package com.db.demo.day3.ex;

public class ExDemo {

    public static void main(String[] args) {

        int num = 10;
        int num2 = 0;

        System.out.println("Start");
//        System.out.println(num / num2);


        String[] myFriends = {"Sonu", "Monu", "Tonu"};
        System.out.println(myFriends[3]); // ArrayIndexOutOfBoundsException

        String str = "abcd";
        System.out.println(str.charAt(4)); // .StringIndexOutOfBoundsException

        System.out.println("End");
    }
}
