package com.db.demo.day3.oop.abs;

public class AbsDemo {

    public static void main(String[] args) {

        HdfcBank bank1 = new HdfcBank();
        bank1.doKyc();
        IciciBank bank2 = new IciciBank();
        bank2.doKyc();

//        final int var = 10;
//        var = 20;

//        final field = can not be reassigned a value
//        final method = can not be overridden
//        final class = can not be extended




    }

}
