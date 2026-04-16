package OOPS;

class Cellphone {
    public void ring() {
        System.out.println("Ringing.....");
    }

    public void vibrate() {
        System.out.println("Vibrating.....");
    }

    public void call() {
        System.out.println("Calling Ullu.....");
    }
}

public class question2 {
    public static void main(String[] args) {

        Cellphone iphone = new Cellphone();
        iphone.ring();
        iphone.vibrate();
        iphone.call();

    }

}
