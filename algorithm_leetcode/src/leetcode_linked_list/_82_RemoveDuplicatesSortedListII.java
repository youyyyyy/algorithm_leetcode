package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution82 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1, head);

        ListNode slow = dummy;  // use this node to connect distinct node
        ListNode fast = head; // use this node to check duplicate

        while (fast != null && fast.next != null) {
            if (fast.val != fast.next.val) {
                slow = fast;
            } else {
                while (fast.next != null && fast.val == fast.next.val) fast = fast.next;
                slow.next = fast.next;
            }
            fast = fast.next;
        }

        return dummy.next;
    }
}

public class _82_RemoveDuplicatesSortedListII {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(3);
        ListNode n5 = new ListNode(4);
        ListNode n6 = new ListNode(4);
        ListNode n7 = new ListNode(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        Solution82 slt = new Solution82();
        ListNode res = slt.deleteDuplicates(n1);
        printLinkedList(res);

    }

    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
    }
}
