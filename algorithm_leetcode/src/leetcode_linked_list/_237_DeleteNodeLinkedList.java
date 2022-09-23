package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution237 {
    public void deleteNode(ListNode node) {
        while (node.next.next != null) {
            node.val = node.next.val;
            node = node.next;
        }
        node.val = node.next.val;
        node.next = null;
    }
}

public class _237_DeleteNodeLinkedList {
}
