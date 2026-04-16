package OOPS.Inheritance;

class A {
    public void method1() {
        System.out.println(" Method 1 of Class A.....");
    }

    public void method2() {
        System.out.println(" Method 2 of Class A.....");

    }
}

class B {
    public void method1() {
        System.out.println(" Method 1 of Class B.....");
    }

    public void method2() {
        System.out.println(" Method 2 of Class B.....");

    }
}

public class methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();

    }

}
