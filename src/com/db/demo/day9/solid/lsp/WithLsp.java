package com.db.demo.day9.solid.lsp;

public class WithLsp {

}

interface RideAcceptable {
    void acceptRide();
}

class ActiveDriver implements RideAcceptable {
    public void acceptRide() {
        System.out.println("Ride accepted");
    }
}

// SuspendedDriver is not part of RideAcceptable – no violation
class SuspendedDriver {
    public void appealSuspension() {
        System.out.println("Appeal Submitted");
    }
}
