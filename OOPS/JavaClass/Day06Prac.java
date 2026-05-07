package OOPS.JavaClass;

import Recursion.sumOfDigits;

class Shape {
    int side;

    public void calculateSquare() {
        System.out.println("Area of Square : " + (side * side));
    }
}

class Area extends Shape {
    public Area(int side) {
        this.side = side;
    }
}

public class Day06Prac {
    public static void main(String[] args) {
        Area a = new Area(5);
        a.calculateSquare();
    }
}
