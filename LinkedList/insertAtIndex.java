package LinkedList;

import java.util.*;

public class insertAtIndex {
    // declare a node
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

        // insert at first.....
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

        // insert at index....
        void insertAtIndex(int val, int index) {
            if (index < 0 || index > size) {
                System.out.println("Not Possible to insert node at index..");
                return;
            }

            this.size++;
            Node newNode = new Node(val);
            if (this.head == null) {
                this.head = newNode;
                return;
            }

            Node temp = this.head;
            for(int i=0 ; i<index-1; i++){
                temp = temp.next;
            }

            newNode.next = temp.next;  //newNode ke next ko temp ke next se jod do
            temp.next = newNode;  // temp ke next ko newNode se jod do
        }

        // print Nodes.....
        void printLL() {
            Node temp = this.head;
            if (temp == null) {
                System.out.println("Empty List.....");
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
        // System.out.println("====Empty List =====");
        // obj.printLL();

        // print insert at first node.....
        obj.insertAtFirst(20);
        obj.insertAtFirst(40);
        obj.insertAtFirst(60);
        obj.insertAtFirst(80);
        obj.insertAtFirst(100);
        obj.printLL();

        obj.insertAtIndex(204, 1);
        obj.printLL();

    }

}
