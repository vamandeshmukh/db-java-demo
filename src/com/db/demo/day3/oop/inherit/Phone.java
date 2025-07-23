package com.db.demo.day3.oop.inherit;

public class Phone {
    static int model = 5530;

    public void call() {
        System.out.println("Calling...");
    }
    public void sms() {
        System.out.println("Sending SMS...");
    }
}

class FeaturePhone extends Phone {

}

class SmartPhone extends Phone {

    @Override
    public void call() {
        System.out.println("calling with recording...");
    }

    public void camera() {
        System.out.println("pics...");
    }
}
