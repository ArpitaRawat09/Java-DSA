package OOPS;

class Employee {
    int id;
    String name;

    // public Employee() { //constructors without arguments
    // id = 12;
    // name = "Arpita Rawat";
    // }

    public Employee(String myName, int myId) { // constructors with arguments
        id = myId;
        name = myName;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setId(int i) {
        this.id = i;
    }
}

public class constructor {
    public static void main(String[] args) {
        // Employee e = new Employee();   wihtout argument 
        Employee e = new Employee("Arpita Rawat", 12);   // with argument

        System.out.println(e.getName());
        System.out.println(e.getId());
    }
}
