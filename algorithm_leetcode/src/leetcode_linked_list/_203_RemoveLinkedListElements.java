package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

// Time complexity: O(N)
// Space complexity: O(1)
class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}

public class _203_RemoveLinkedListElements {
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
