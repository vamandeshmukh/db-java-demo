package com.db.demo.day3.oop.encap;

public class Employee {

    // Abstraction - minimum necessary representation = collect only the important details

    private int id;
    private String name;
    private double salary;
    // email, phone, address, dob, aadhaar, photo , ...

    public Employee() {

    }

    public Employee(int id, String name) {
        super();
        this.id = id;
        this.name = name;
    }

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

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

    // hashcode, equals

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name='" + name + '\'' + ", salary=" + salary + '}';
    }
}
