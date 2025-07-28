package com.db.demo.day3.fun;

// option 1 - to use normal interface (also used for functional interface)

//public class Fun {
//    public static void main(String[] args) {
//        ConcreteClass obj = new ConcreteClass();
//        obj.abstractMethod();
//        obj.anotherAbstractMethod();
//    }
//}

// option 2 - to use normal interface  (also used for functional interface)

public class Fun {
    public static void main(String[] args) {
        NormalInterface obj = new NormalInterface(){
            @Override
            public void abstractMethod() {
                System.out.println("abstract method in a normal interface");
            }

            @Override
            public void anotherAbstractMethod() {
                System.out.println("another abstract method in a normal interface");
            }
        };
        obj.abstractMethod();
        obj.anotherAbstractMethod();

    }
}

interface NormalInterface {

    public  abstract void abstractMethod();
    public abstract void anotherAbstractMethod();
}

class ConcreteClass implements NormalInterface {

    @Override
    public void abstractMethod() {
        System.out.println("abstract method in a normal interface");
    }

    @Override
    public void anotherAbstractMethod() {
        System.out.println("another abstract method in a normal interface");
    }
}

@FunctionalInterface
interface FunInterface {

    public abstract void funMethod();

}


//abstract class Abs {
//    abstract void m2();
//}
//
//interface Int1 {
////    void m1();
//    public abstract void m1();
//}


