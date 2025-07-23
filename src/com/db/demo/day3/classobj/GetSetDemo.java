package com.db.demo.day3.classobj;

public class GetSetDemo {

    public static void main(String[] args) {
        Employee emp = new Employee();
//        emp.salary = emp.salary * 2;
//        System.out.println(emp.salary);
        // set the salary -
        emp.setId(101);
        emp.setName("Sonu");
        emp.setSalary(90000);
        System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
        System.out.println(emp.toString());




    }
}
