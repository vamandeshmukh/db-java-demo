package com.db.demo.day2.classobj;

public class Employee {

    private int id;
    private String name; // private
    private double salary;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

//package com.db.demo.day2.classobj;
//
//public class Employee {
//
//    //    instance variables / object fields - non static
//    private int id;
//    private String name; // private
//    private double salary;
//    private String email;
//
//    // class variables - static
//    static String officePhone;
//
//    void coding() {
//        System.out.println(name + " is coding...");
//    }
//
//    public static int addNums(int a, int b) {
//        return a + b;
//    }
//}
