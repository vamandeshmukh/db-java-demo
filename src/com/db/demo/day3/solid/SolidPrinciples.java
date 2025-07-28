package com.db.demo.day3.solid;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SolidPrinciples {

    public static void main(String[] args) {

        // List - ArrayList, LinkedList

        List list1 = new ArrayList();
        list1 = new LinkedList();

        ArrayList list2 = new ArrayList();
//        list2 = new LinkedList();





        System.out.println("SOLID Principles\n" +
                "S: Single Responsibility Principle (SRP)\n" +
                "O: Open/Closed Principle (OCP)\n" +
                "L: Liskov Substitution Principle (LSP)\n" +
                "I: Interface Segregation Principle (ISP)\n" +
                "D: Dependency Inversion Principle (DIP)\n" +
                "Uber App\n" +
                "Driver, Rider, Ride, Payment, etc\n");
    }
}
