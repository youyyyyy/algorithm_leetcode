package leetcode_recursion.linked_list;

import fcc_code_example_recursion.ListNode;

/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        // 1. each call is to swap a pair of nodes
        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;

        return temp;
    }
}


/*
Iterative:
 - Time complexity: O(n)
 - Space complexity: O(1)
class Solution0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode pre = new ListNode(-1, head);
        ListNode cur = pre; // 1. cur points to node before each pair
        while (head != null && head.next != null) {
            ListNode first = head;
            ListNode second = head.next;

            // 2. swap
            cur.next = second;
            first.next = second.next;
            second.next = first;

            // 3. update cur and head for next pair
            cur = first;
            head = first.next;
        }

        return pre.next;
    }
}
*/

public class _0024_SwapNodesPairs {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Solution0024 slt = new Solution0024();
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
