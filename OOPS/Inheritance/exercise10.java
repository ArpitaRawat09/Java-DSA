package OOPS.Inheritance;

class Circle {
    public int radius;

    Circle() {
        System.out.println("I am non-Parametrized of Circle");
    }

    Circle(int r) {
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

}

class Cylinder extends Circle {
    public int height;

    Cylinder(int r, int h) {
        super(r);
        System.out.println("I am Paramatrized of Cylinder....");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.radius;
    }

}

public class exercise10 {
    public static void main(String[] args) {
        // Circle c = new Circle();
        Cylinder cy = new Cylinder(3, 6);
        cy.area();



    }
}
