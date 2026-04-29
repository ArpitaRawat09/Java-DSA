package LinkedList;

import java.util.*;

public class reverseList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // reverse List Iterative approach ----->
    // public static ListNode revList(ListNode list) {
    // ListNode curr = list;
    // ListNode prev = null;

    // while (curr != null) {
    // ListNode temp = curr.next;
    // curr.next = prev;
    // prev = curr;
    // curr = temp;
    // }
    // return prev;
    // }

    // method signature bhi change hogi — curr aur prev dono pass karne honge
    // recursive approach --->
    public static ListNode revList(ListNode curr, ListNode prev) {

        if (curr == null) {
            return prev; // base case — list khatam, prev return karo
        } else {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
            return revList(curr, prev); // ✅ recursive call
        }
    }

    // Helper build Linked list from array
    public static ListNode buildList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;
        for (int i = 1; i < arr.length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }

    public static void printLL(ListNode head) {
        ListNode temp = head;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(",");
            }
            temp = temp.next;
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 6 };

        ListNode list = buildList(a);

        ListNode result = revList(list , null);
        printLL(result);
    }

}
