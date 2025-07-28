package com.db.demo.day9.solid.dip;

public class WithDip {

}

interface Notifier {
    void notify(String message);
}

//class SmsSender implements Notifier {
//    public void notify(String msg) {
//        System.out.println("SMS: " + msg);
//    }
//}

class EmailSender implements Notifier {
    public void notify(String msg) {
        System.out.println("Email: " + msg);
    }
}

//class NotificationService {
//    private Notifier notifier;
//
//    public NotificationService(Notifier notifier) {
//        this.notifier = notifier;
//    }
//
//    public void notifyUser() {
//        notifier.notify("Your ride has arrived");
//    }
//}
