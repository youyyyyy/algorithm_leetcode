package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;

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

public class _141_LinkedListCycle {
}
