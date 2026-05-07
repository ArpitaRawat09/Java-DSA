package OOPS.Abstract;

abstract class Test {
    public Test() {
        System.out.println("I am a parent class Constructor.....");
    }

    public void goodMorning() {
        System.out.println("Good Morning EveryOne.......");
    }

    abstract public void greet();
}

class Implement extends Test {
    public void greet() {
        System.out.println("Namaste .......");
    }
}

public class basicAbstract {
    public static void main(String[] args) {
        Implement obj = new Implement();
        obj.greet();
        obj.goodMorning();
    }
}
