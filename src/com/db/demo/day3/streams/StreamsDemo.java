package com.db.demo.day3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamsDemo {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>();

        empList.addAll(Arrays.asList(new Employee(101, "Sonu", 890000.0),
                new Employee(102, "Monu", 90000.00),
                new Employee(103, "Tonu", 850000.0)));

        empList.forEach(e -> System.out.println(e.toString()));

        



    }
}
