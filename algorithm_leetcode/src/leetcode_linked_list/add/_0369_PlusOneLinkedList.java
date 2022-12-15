package leetcode_linked_list.add;

import data_structure_class.ListNode;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0369 {
    public ListNode plusOne(ListNode head) {
        head = reverse(head);

        ListNode cur = head;
        while (cur != null) {
            if (cur.val != 9) {
                cur.val++;
                return reverse(head);
            } else {
                cur.val = 0;
                cur = cur.next;
            }
        }

        return new ListNode(1, reverse(head));
    }

    private ListNode reverse(ListNode head) {
        if (head.next == null) return head;
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}

public class _0369_PlusOneLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);

        n1.setNext(n2);
        n2.setNext(n3);

        Solution0369 slt = new Solution0369();
        ListNode res = slt.plusOne(n1);
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
