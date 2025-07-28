package com.db.demo.day3.solid.isp;

public class WithIsp {

}

interface RideDriver {
    void acceptRide();
}

interface FoodDeliveryDriver {
    void deliverFood();
}

class CabDriver implements RideDriver {
    public void acceptRide() {
        System.out.println("Cab ride started");
    }
}
