package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;



// Time complexity: O(N)
// Space complexity: O(1)
class Solution24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode dummy = new ListNode(-1, head);
        ListNode cur = dummy;
        while (head != null && head.next != null) {

            ListNode temp1 = head;
            ListNode temp2 = head.next;

            cur.next = temp2;
            temp1.next = temp2.next;
            temp2.next = temp1;

            cur = temp1;
            head = temp1.next;
        }

        return dummy.next;
    }
}

public class _24_SwapNodesPairs {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Solution24 slt = new Solution24();
        ListNode res = slt.swapPairs(n1);
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
