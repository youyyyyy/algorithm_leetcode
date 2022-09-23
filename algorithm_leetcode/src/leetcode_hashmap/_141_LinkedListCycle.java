package leetcode_hashmap;

import fcc_code_example_recursion.ListNode;

import java.util.HashSet;


// Time complexity: O(n)
// Space complexity: O(n)
class Solution141 {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) return false;
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (!visited.add(head)) return true;
            head = head.next;
        }
        return false;
    }
}

public class _141_LinkedListCycle {
}
