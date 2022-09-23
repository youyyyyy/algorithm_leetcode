/*
 * Code example from freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;// Definition for singly-linked list.

public class SortedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(13);
        ListNode n4 = new ListNode(14);
        ListNode n5 = new ListNode(550);

        ListNode n1_2 = new ListNode(2);
        ListNode n2_2 = new ListNode(15);
        ListNode n3_2 = new ListNode(130);
        ListNode n4_2 = new ListNode(200);
        ListNode n5_2 = new ListNode(350);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);
        n4_2.setNext(n5_2);

        ListNode res = SortedMerge(n1,n1_2);
        printLinkedList(res);

    }

    public static ListNode SortedMerge(ListNode A, ListNode B) {
        if (A == null) return B;
        if (B == null) return A;

        if (A.val < B.val) {
            A.next = SortedMerge(A.next, B);
            return A;
        } else {
            B.next = SortedMerge(A, B.next);
            return B;
        }
    }

    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
    }


}
