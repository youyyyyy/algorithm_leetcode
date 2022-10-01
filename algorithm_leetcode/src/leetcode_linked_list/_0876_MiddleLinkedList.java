package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */

class Solution0876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

public class _0876_MiddleLinkedList {

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);

        Solution0876 slt = new Solution0876();
        ListNode res = slt.middleNode(n1);
        System.out.println(res.val);

    }

}
