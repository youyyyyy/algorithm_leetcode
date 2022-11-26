package leetcode_linked_list.remove;

import fcc_code_example_recursion.ListNode;

/*
 * Time complexity: O(1)
 * Space complexity: O(1)
 * */
class Solution0237 {
    public void deleteNode(ListNode node) {
        // node is not a tail node
        node.val = node.next.val;
        node.next = node.next.next;
    }
}

public class _0237_DeleteNodeLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(4);
        ListNode n2 = new ListNode(5);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(9);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Solution0237 slt = new Solution0237();
        slt.deleteNode(n2);
        printLinkedList(n1);
    }

    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
    }
}
