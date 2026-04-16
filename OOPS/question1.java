package OOPS;

class Employee {
    // private int salary; using Getter and Setter
    // private String name;

    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public void setSalary(int s) {
        salary = s;
    }

}

public class question1 {
    public static void main(String[] args) {

        Employee arpu = new Employee();
        arpu.setName("Arpita Rawat");
        arpu.setSalary(25000);

        System.out.println(arpu.getName());
        System.out.println(arpu.getSalary());

    }
}
