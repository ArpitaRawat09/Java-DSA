package OOPS.Inheritance;

class Base {
    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int n) {
        System.out.println("setting num now");
        this.num = n;
    }

    public void printMe() {
        System.out.println("Inheritance....");
    }

}

class Derived extends Base {
    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

}

public class inheritance {

    public static void main(String[] args) {

        Base b = new Base();
        b.setNum(12);
        System.out.println(b.getNum());


        Derived d = new Derived();
        d.setNum(23);
        System.out.println(d.getNum());

    }

}
