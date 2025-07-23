package com.db.demo.day2.equals;

public class EqualsDemo {

    public static void main(String[] args) {

        Employee emp1 = new Employee(101, "Sonu", 90000);
        Employee emp2 = new Employee(101, "Sonu", 90000);

        System.out.println(emp1.equals(emp2));
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

    }
}
