package leetcode_linked_list.remove;

import data_structure_class.ListNode;

import java.util.HashMap;

class Solution1836 {
    public ListNode deleteDuplicatesUnsorted(ListNode head) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ListNode cur = head;
        while (cur != null) {
            map.put(cur.val, map.getOrDefault(cur.val, 0) + 1);
            cur = cur.next;
        }

        ListNode pre = new ListNode(-1, head);
        cur = pre;
        while (cur.next != null) {
            if (map.get(cur.next.val) > 1) cur.next = cur.next.next;
            else cur = cur.next;
        }

        return pre.next;
    }
}

public class _1836_RemoveDuplicatesFromUnsortedLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(1);
        ListNode n4 = new ListNode(3);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        Solution1836 slt = new Solution1836();
        ListNode res = slt.deleteDuplicatesUnsorted(n1);
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
