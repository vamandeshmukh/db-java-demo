package com.db.demo.day3.oop.abs;

abstract class Rbi {
    void payInterest() {
    }
    abstract void doKyc();
}

interface FinMin {
    public abstract void payTax();
}
interface LabourMin {
    public abstract void paySalary();
}

class HdfcBank extends Rbi implements FinMin, LabourMin {

    @Override
    void doKyc() {
        System.out.println("Aadhaar");
    }

    @Override
    public void payTax() {
        System.out.println("paying 18% GST");
    }

    @Override
    public void paySalary() {
        System.out.println("Paying salary in time");
    }
}

class IciciBank extends Rbi {
    @Override
    void doKyc() {
        System.out.println("Passport");
    }
}



//public abstract class Demo {
//
//    public void concreteMethod() {
//
//    }
//
//// instructions - do this work - What + How?
////    .. concrete method - what + how?
//    // abstract method - only What?
////    public int addNums(int i, int j) // What does this method do?
////    { // How does it do it?
////        return i + j;
////    }
//
//    public abstract int addNums(int i, int j);
//
//
//}
//
//

class Parent { }
interface Teacher { }
interface Neighbour { }
interface Friend { }
interface Relative { }

class Person extends Parent implements Teacher, Neighbour, Friend, Relative {

}
