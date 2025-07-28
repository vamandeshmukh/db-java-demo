package com.db.demo.day3.solid.srp;

public class WithoutSrp {

}

class RideService {
    public void createRide() {
        System.out.println("Ride Created");
    }

    public void calculateFare() {
        System.out.println("Fare Calculated");
    }

    public void sendNotification() {
        System.out.println("Notification Sent");
    }
}

