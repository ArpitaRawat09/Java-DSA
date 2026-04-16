package OOPS;

class Employee {
    int id;
    String name;
    int salary;
    int age;

    public void printdetails() {
        System.out.println("My id is : " + id);
        System.out.println("My name is: " + name);
        System.out.println("My salary is:" + salary);
    }

    public int getAge() {
        return age;
    }

}

public class classs {
    public static void main(String[] args) {
        System.out.println("This is our Custom Class..");
        Employee harry = new Employee();
        Employee bhaven = new Employee();

        harry.id = 12;
        harry.name = "Arpita Rawat";
        harry.age = 34;

        bhaven.name = "Bhaven";
        bhaven.salary = 2000;
        bhaven.age = 21;

        harry.printdetails();
        bhaven.printdetails();

        int age = bhaven.getAge();
        System.out.println("Bhaven age is: " + age);

        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }

}
