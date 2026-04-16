package OOPS.Abstract;

abstract class Parent {
    public Parent() {
        System.out.println("I am Parent Class Constructor.....");
    }

    public void sayHello() {
        System.out.println("Hello....");
    }

    abstract public void greet(); // abstract method

}

class Child extends Parent {
    public void greet() { // abstract method implement
        System.out.println("Namaste Bharat Wasiyooooo......");
    }

}

public class abstarctClassOrMethod {
    public static void main(String[] args) {
        Child c = new Child();
        c.greet();
        // c.sayHello();
    }
}
