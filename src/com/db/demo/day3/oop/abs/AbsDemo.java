package com.db.demo.day3.oop.abs;

public class AbsDemo {

    public static void main(String[] args) {

        HdfcBank bank1 = new HdfcBank();
        bank1.doKyc();
        IciciBank bank2 = new IciciBank();
        bank2.doKyc();


    }

}
