package com.db.demo.day3.col;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

    public static void main(String[] args) {

        Set<String> mySet = new HashSet<>();
        mySet.add("Fridge");
        mySet.add("TV");
        mySet.add("AC");
        System.out.println(mySet.size()); // 3
        System.out.println(mySet);
        mySet.add("TV");
        System.out.println(mySet.size()); // 3
        System.out.println(mySet);
//        mySet.




    }
}
