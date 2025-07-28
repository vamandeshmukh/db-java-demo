package com.db.demo.day3.solid.dip;

public class WithoutDip {

}

class NotificationService {
    private SmsSender smsSender = new SmsSender();

    public void notifyUser() {
        smsSender.sendSMS("Your ride has arrived");
    }
}

class SmsSender {
    public void sendSMS(String msg) {
        System.out.println("SMS: " + msg);
    }
}
