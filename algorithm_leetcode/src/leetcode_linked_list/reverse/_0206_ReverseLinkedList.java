package leetcode_linked_list.reverse;

import data_structure_class.ListNode;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0206 {

    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;

    }
}

/*
Recursion:
 - Time complexity: O(n)
 - Space complexity: O(n)
class Solution0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
*/


public class _0206_ReverseLinkedList {
    public static void main(String[] args) {
        Solution0206 slt = new Solution0206();
        printLinkedList(slt.reverseList(createListNode(new int[]{1, 2, 3, 4, 5})));  // 5 4 3 2 1
        printLinkedList(slt.reverseList(createListNode(new int[]{1, 2})));  // 2 1
        printLinkedList(slt.reverseList(createListNode(new int[]{})));
    }

    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public static ListNode createListNode(int[] arr) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        for (int i : arr) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return pre.next;
    }
}
