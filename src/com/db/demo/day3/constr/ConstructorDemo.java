package com.db.demo.day3.constr;

public class ConstructorDemo {

    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setId(101);
        emp.setName("Sonu");
        emp.setSalary(90000);
        System.out.println(emp.toString());

        Employee emp2 = new Employee(102, "Monu", 95000);
        System.out.println(emp2.toString());
    }
}
