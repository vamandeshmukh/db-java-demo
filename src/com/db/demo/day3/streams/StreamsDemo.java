package com.db.demo.day3.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

// com.db.maven.demo

public class StreamsDemo {

    public static void main(String[] args) {

        List<Employee> empList = new ArrayList<>(Arrays.asList(new Employee(101, "Sonu", 95000.0),
                new Employee(102, "Monu", 90000.00),
                new Employee(103, "Tonu", 85000.0)));

        System.out.println("List out all the employees:");
        empList.forEach(e -> System.out.println(e.toString()));

//        Streams API filter, map, reduce, collect, skip. limit
        System.out.println("Employees with salary > 90000:");

        Stream<Employee> empsWithMoreSal = empList.stream().filter(emp -> emp.getSalary() > 90000.0);
        empsWithMoreSal.forEach(System.out::println);

        System.out.println("Show the first two employees:");
        empList.stream().limit(2).toList().forEach(System.out::println);

        System.out.println("Skip the first employee:");
        empList.stream().skip(1).toList().forEach(System.out::println);

        System.out.println("print names in upper case:");
        empList.stream().map(e -> e.getName().toUpperCase()).toList().forEach(System.out::println);

    }
}

//assignment - comparable, comparator, sort, Collections.sort() etc stuff
//maven project
