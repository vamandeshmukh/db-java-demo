package com.db.demo.day3.col;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterationDemo {

    public static void main(String[] args) {

        List<String> friends = new ArrayList<>();
        friends.add("Sonu");
        friends.add("Monu");
        friends.add("Tonu");
        friends.add("Ponu");
        friends.add("Gonu");
        System.out.println(friends);
        System.out.println("Iterate using for each loop:");
        for (String friend : friends)
            System.out.println(friend);
        System.out.println("Iterate using for Iterator:");
        Iterator<String> iterator = friends.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("Iterate using for each method:");
        // code here 




    }
}
