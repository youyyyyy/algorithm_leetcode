package leetcode_linked_list.reverse;

import fcc_code_example_recursion.ListNode;

class Solution0092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1, head);
        ListNode leftPrev = dummy; // node before left
        ListNode cur = dummy;  // node start to reverse

        // 1. find the node before reverse, and the node starts to reverse
        for (int i = 0; i < left; i++) {
            leftPrev = cur;
            cur = cur.next;
        }

        // 2. reverse the nodes in the range
        ListNode prev = null;
        for (int i = 0; i < right - left + 1; i++) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        // 3. clean up
        // leftPrev still points to the node where reverse starts, cur now points to the first node after right node
        leftPrev.next.next = cur;
        leftPrev.next = prev;

        return dummy.next;
    }
}

public class _0092_ReverseLinkedListII {
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

        Solution0092 slt = new Solution0092();
        int left = 2, right = 4;
        ListNode res = slt.reverseBetween(n1, left, right);
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
