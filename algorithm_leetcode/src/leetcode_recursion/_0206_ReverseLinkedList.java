package leetcode_recursion;

import fcc_code_example_recursion.ListNode;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution0206 {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}

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
