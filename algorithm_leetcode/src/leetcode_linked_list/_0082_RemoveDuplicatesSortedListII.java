package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0082 {
    public ListNode deleteDuplicates(ListNode head) {

        if (head == null || head.next == null) return head;

        ListNode pre = new ListNode(-1, head);
        ListNode cur = pre; // use this node to connect distinct node

        while (head != null && head.next != null) {
            if (head.val == head.next.val) {
                while (head.next != null && head.val == head.next.val) head = head.next;
                cur.next = head.next;
            } else {
                cur = head;
            }
            head = head.next;
        }

        return pre.next;
    }
}

public class _0082_RemoveDuplicatesSortedListII {
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

        Solution0082 slt = new Solution0082();
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
