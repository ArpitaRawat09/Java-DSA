package LinkedList;

import java.util.*;

public class deleteAtLast {
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    static class LinkedList {
        Node head;
        int size;

        LinkedList() {
            this.head = null;
            this.size = 0;
        }

        // insert at first...
        void insertAtFirst(int val) {
            this.size++;
            Node newNode = new Node(val);

            if (this.head == null) {
                this.head = newNode;
                return;
            }

            newNode.next = this.head;
            this.head = newNode;
        }

        // delete at last....
        void deleteAtLast() {
            if (this.head == null) {
                System.out.println("====Empty List ===");
                return;
            }

            if (this.head.next == null) {
                this.head = null;
                return;
            }

            Node temp = this.head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }

        void printLL() {
            Node temp = this.head;
            if (temp == null) {
                System.out.println("Empty List....");
                return;
            }

            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

    }

    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        obj.insertAtFirst(11);
        obj.insertAtFirst(22);
        obj.insertAtFirst(33);
        obj.insertAtFirst(44);
        obj.insertAtFirst(55);
        obj.printLL();

        obj.deleteAtLast();
        obj.printLL();

    }

}
