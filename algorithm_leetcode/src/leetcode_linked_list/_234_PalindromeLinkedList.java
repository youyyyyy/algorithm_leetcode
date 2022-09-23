package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;


// Time complexity: O(N)
class Solution234 {
    public boolean isPalindrome(ListNode head) {
        if (head != null && head.next == null) return true;

        // find the node in the middle
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse the second half of nodes
        ListNode secondHalf = reverse(slow.next);

        // compare the first half and the second half
        ListNode cur = head;
        while (secondHalf != null) {
            if (cur.val != secondHalf.val) return false;
            cur = cur.next;
            secondHalf = secondHalf.next;
        }
        return true;
    }

    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = reverse(head.next);
        head.next.next = head; // head.next refers to the last node of the sublist
        head.next = null;
        return temp;
    }
}

public class _234_PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(8);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(8);


        n1.setNext(n2);
        n2.setNext(n3);


        Solution234 slt = new Solution234();
        boolean res = slt.isPalindrome(n1);
        System.out.println(res);

    }
}
