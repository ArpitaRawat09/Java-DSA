package LinkedList;

import java.util.*;

public class insertAtFirst {
    // declaring a Node
    static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Linked List
    static class LinkedList {
        Node head;
        int size;

        LinkedList() {
            this.head = null;
            this.size = 0;
        }

        // insert at first
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

        // insert at last
        void insertAtLast(int val) {
            this.size++;
            Node newNode = new Node(val);

            if (this.head == null) {
                this.head = newNode;
                return;
            }
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        void printLL() {
            Node temp = this.head;
            if (temp == null) {
                System.out.println("Empty List...");
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

        // khali List print
        System.out.println("====Empty List =====");
        obj.printLL();

        // insert at first
        System.out.println("\n ==== Insert At First =====");
        obj.insertAtFirst(10);
        obj.insertAtFirst(20);
        obj.insertAtFirst(30);
        obj.insertAtFirst(40);
        obj.insertAtFirst(50);
        obj.printLL();

        // insert at last
        System.out.println("\n ==== Insert At Last =====");
        obj.insertAtLast(99);
        obj.insertAtLast(100);
        obj.insertAtLast(110);
        obj.insertAtLast(120);
        obj.printLL();

    }
}

