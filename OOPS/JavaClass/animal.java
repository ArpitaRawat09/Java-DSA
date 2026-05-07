package OOPS.JavaClass;

class Animals {
    String name;

    public Animals(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println(name + " is Eating....");
    }

    public void sound() {
        System.out.println("Animals make sound.");
    }
}

class Cat extends Animals {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says... Meow");
    }

}

class Tiger extends Cat {
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println(name + " says... Rourr");
    }

}

public class animal {
    public static void main(String[] args) {
        Animals a = new Animals("Animals");
        Cat c = new Cat("Kitty");
        Tiger t = new Tiger("shera");

        a.sound();
        c.sound();
        t.sound();
    }
}
