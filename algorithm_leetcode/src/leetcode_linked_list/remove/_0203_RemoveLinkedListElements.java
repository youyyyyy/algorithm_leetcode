package leetcode_linked_list.remove;

import fcc_code_example_recursion.ListNode;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(-1, head);
        ListNode cur = pre;

        while (cur.next != null) {
            if (cur.next.val == val) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return pre.next;
    }
}

public class _0203_RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(1);
        ListNode n5 = new ListNode(2);
        int val = 1;

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);

        Solution203 slt = new Solution203();
        ListNode res = slt.removeElements(n1, val);
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
