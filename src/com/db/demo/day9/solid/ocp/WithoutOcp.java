package com.db.demo.day9.solid.ocp;

public class WithoutOcp {

}

class PaymentService {

    public void pay(String mode) {
        if (mode.equals("CARD")) {
            System.out.println("Card Payment");
        } else if (mode.equals("UPI")) {
            System.out.println("UPI Payment");
        }
    }
}

