package leetcode_linked_list.other;

import data_structure_class.ListNode;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0141 {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }

        return false;
    }
}

public class _0141_LinkedListCycle {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n2);

        Solution0141 slt = new Solution0141();
        boolean res = slt.hasCycle(n1);
        System.out.println(res);
    }
}
