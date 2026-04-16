package OOPS.Inheritance;


class Base {
    Base() {
        System.out.println("I am a Constructor of Base class....");

    }

    Base(int x) {
        System.out.println("I am a Overloaded Constructor with value of x as:" + x);
    }

}

class Derived extends Base {
    Derived() {
        System.out.println("I am a Constructor of Derived class....");
    }

    Derived(int x, int y) {
        super(x);
        System.out.println("I am a Overloaded Constructor with value of  y as:" + y);
    }

}

public class consInheritance {
    public static void main(String[] args) {
        // Base b = new Base();

        // Derived d = new Derived(12,34);

    }
}
