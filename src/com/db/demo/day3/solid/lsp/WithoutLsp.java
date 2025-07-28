package com.db.demo.day3.solid.lsp;

public class WithoutLsp {

}

class Driver {
    public void acceptRide() {
        System.out.println("Ride accepted");
    }
}

//class SuspendedDriver extends Driver {
//    public void acceptRide() {
//        throw new RuntimeException("Suspended drivers can't accept rides");
//    }
//}
