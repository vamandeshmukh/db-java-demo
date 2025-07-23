package com.db.demo.day3.oop.overload;

public class OverloadDemo {
    //        Polymorphism - 1. method overloading, 2. method overriding
//        method overloading - methods with the same name but with different args
    public static void main(String[] args) {

        System.out.println(Calc.addNums(10, 20));
        System.out.println(Calc.addNums(10, 20, 30));

    }
}
