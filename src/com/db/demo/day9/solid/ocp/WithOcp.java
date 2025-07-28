package com.db.demo.day9.solid.ocp;

public class WithOcp {

}

interface PaymentMode {
    void pay();
}

class CardPayment implements PaymentMode {
    public void pay() {
        System.out.println("Card Payment");
    }
}

class UpiPayment implements PaymentMode {
    public void pay() {
        System.out.println("UPI Payment");
    }
}

class NetbankingPayment implements PaymentMode {
    public void pay() {
        System.out.println("Netbanking Payment");
    }
}
// add other classes as needed

class PaymentGateway { // PaymentService
    public void pay(PaymentMode paymentMode) {
        paymentMode.pay();
    }
}

