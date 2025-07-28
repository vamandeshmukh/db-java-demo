package com.db.demo.day3.solid.isp;

public class WithoutIsp {

}

interface Driver {
    void acceptRide();
    void playMusic();
    void deliverFood();
}

//class CabDriver implements Driver {
//    public void acceptRide() { }
//    public void playMusic() { }
//    public void deliverFood() {
//        throw new UnsupportedOperationException("Not a delivery driver");
//    }
//}
