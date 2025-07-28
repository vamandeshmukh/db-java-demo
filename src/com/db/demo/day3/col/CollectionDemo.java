package com.db.demo.day3.col;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CollectionDemo {

    public static void main(String[] args) {

//        array
        Integer num = 10; // 10, 20, 30
        Integer[] numArray = {10, 20, 30}; //
//        Integer[] numArray = {10, false, "abc"}; //

        // friends list
        ArrayList friends = new ArrayList();
        System.out.println(friends.size()); // 0
        System.out.println(friends);
        friends.add("Sonu");
        friends.add("Monu");
        friends.add("Tonu");
        System.out.println(friends.size()); // 3
        System.out.println(friends);
        friends.remove(0);
        System.out.println(friends.size()); // 2
        System.out.println(friends);
        // flexibility
        friends.add(10);
        friends.add(false);
        System.out.println(friends.size()); // 2
        System.out.println(friends);

        List<Integer> numList = new LinkedList<>();
        numList.addAll(Arrays.asList(22, 31, 25, 9, 17, 2, 7, 1));
        numList.remove(2);






















    }

}
