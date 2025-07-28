package com.db.demo.day3.fun;

public class FunctionalProgramming {

    public static void main(String[] args) {

//        lambda expression

//        FunInterface obj = () -> {};
//        FunInterface obj = () -> {
//            System.out.println("functional method from a functional interface implemented here");
//        };
        FunInterface obj = () -> System.out.println("functional method from a functional interface implemented here");

        obj.funMethod();




    }
}
