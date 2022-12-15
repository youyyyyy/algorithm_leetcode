package leetcode_recursion.linked_list;

import data_structure_class.ListNode;

/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;

        return newHead;
    }
}

/*
Iterative:
 - Time complexity: O(n)
 - Space complexity: O(1)
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;

    }
}
*/


public class _0206_ReverseLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(8);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(1);


        n1.setNext(n2);
        n2.setNext(n3);

        Solution0206 slt = new Solution0206();
        ListNode res = slt.reverseList(n1);
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
