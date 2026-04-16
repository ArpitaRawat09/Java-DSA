package LinkedList;

import java.util.LinkedList;

public class practice {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        LinkedList<Integer> l2 = new LinkedList<>();

        l2.add(12);
        l2.add(23);
        l2.add(89);

        l1.add(8);
        l1.add(9);
       
        l1.add(0, 5);
        l1.add(1, 7);
        l1.addLast(69);

        l1.addAll(0, l2);

        for (int i = 0; i < l1.size(); i++) {
            System.out.print(l1.get(i) + " ");
        }

        // System.out.println(l1.contains(27));
        // System.out.println(l1.indexOf(6));
        // System.out.println(l1.lastIndexOf(6));

    }

}
