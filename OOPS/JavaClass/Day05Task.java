package OOPS.JavaClass;

import java.util.*;

class Student {
    private String name;
    private int age;
    public int rollNo;

    public Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getRollNumber() {
        return this.rollNo;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public void setRollNumber(int newRollNumber) {
        this.rollNo = newRollNumber;
    }
}

public class Day05Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[5];

        // using array
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name of Student " + (i + 1) + ": ");
            String name = sc.next();
            System.out.println("Enter Age of student " + (i + 1) + ": ");
            int age = sc.nextInt();
            System.out.println("Enter rollNumber of student " + (i + 1) + ": ");
            int rollNo = sc.nextInt();

            students[i] = new Student(name, age, rollNo);
        }

        // for print details--->
        for (int i = 0; i < 5; i++) {
            System.out.println(
                    "Student " + (i + 1) + " : " + students[i].getName() + ", " + "Age : " + students[i].getAge() + ", "
                            + " Roll Number : " + students[i].getRollNumber());
        }
        sc.close();

        // e.setName("Bhaven Prajapat");
        // e.setSalary(26);
        // System.out.println("After updating 1- ");

        // System.out.println(e.getName());
        // System.out.println(e.getSalary());

    }
}
