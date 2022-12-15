package leetcode_linked_list;

import data_structure_class.ListNode;

// Time complexity: O(N)
// Space complexity: O(1)
class Solution61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // find the original tail, and store the length
        ListNode cur = head;
        int n = 1;
        while (cur.next != null) {
            cur = cur.next;
            n++;
        }

        // connect the original tail to head
        cur.next = head;

        // find the new head and new tail after rotating
        cur = head;
        ListNode tail = head;
        for (int i = 0; i < n - k % n - 1; i++) {
            cur = cur.next;
            tail = tail.next;
        }
        cur = cur.next;
        tail.next = null;

        return cur;
    }
}


public class _61_Rotate_List {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        int k = 2;

        Solution61 slt = new Solution61();
        ListNode res = slt.rotateRight(n1, k);
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
