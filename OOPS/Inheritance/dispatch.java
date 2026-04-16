package OOPS.Inheritance;

class Phone {
    public void greet() {
        System.out.println("Good Morning....");
    }

    public void on() {
        System.out.println("Phone is on....");
    }
}

class SmartPhone extends Phone {

    public void swagat() {
        System.out.println("Welcome.....");
    }

    public void on() {
        System.out.println("SmartPhone is on....");
    }

}

public class dispatch {
    public static void main(String[] args) {
        Phone obj = new SmartPhone();

        obj.greet();
        obj.on();
    }

}
