package OOPS.JavaClass;

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String s) {
        this.name = s;
    }

    public void setAge(int i) {
        this.age = i;
    }

}

public class test {
    public static void main(String[] args) {
        Student obj1 = new Student("Bhaven", 21);
        Student obj2 = new Student("Sumit", 24);
        Student obj3 = new Student("Namrata", 22);
        Student obj4 = new Student("Arpita", 20);
        Student obj5 = new Student("Pawan", 18);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());

    }
}
