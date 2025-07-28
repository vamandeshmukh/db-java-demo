package com.db.demo.day3.col;

import java.util.ArrayList;

public class CollectionDemo {

    public static void main(String[] args) {

//        array
        Integer num = 10; // 10, 20, 30
        Integer[] numArray = {10, 20, 30}; //
//        Integer[] numArray = {10, false, "abc"}; //

        // friends list
        ArrayList friends = new ArrayList();
        System.out.println(friends.size());
        System.out.println(friends);
        friends.add("Sonu");
        friends.add("Monu");
        friends.add("Tonu");
        System.out.println(friends.size());
        System.out.println(friends);
        friends.remove(0);
        System.out.println(friends.size());
        System.out.println(friends);















    }

}
