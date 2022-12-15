package leetcode_linked_list.remove;

import data_structure_class.ListNode;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(-1, head);
        ListNode fast = pre;
        ListNode slow = pre;

        for (int i = 0; i < n; i++) fast = fast.next;

        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        slow.next = slow.next.next;

        return pre.next;
    }
}

public class _0019_RemoveNthNodeFromEndList {
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

        Solution0019 slt = new Solution0019();
        ListNode res = slt.removeNthFromEnd(n1, 1);
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

