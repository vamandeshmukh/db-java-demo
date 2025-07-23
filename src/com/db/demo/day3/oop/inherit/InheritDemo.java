package com.db.demo.day3.oop.inherit;

public class InheritDemo {

    public static void main(String[] args) {

        SmartPhone sphone = new SmartPhone();
        sphone.camera();
        sphone.call();
        sphone.sms();
//        System.out.println(sphone.model);
        System.out.println(SmartPhone.model);

    }
}
