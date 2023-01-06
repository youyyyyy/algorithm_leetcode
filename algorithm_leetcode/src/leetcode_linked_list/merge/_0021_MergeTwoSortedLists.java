package leetcode_linked_list.merge;

import data_structure_class.ListNode;


/*
 * Time complexity: O(m+n)
 * Space complexity: O(1)
 * */
class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode pre = new ListNode(-1);
        ListNode cur = pre;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }

        cur.next = list1 == null ? list2 : list1;

        return pre.next;

    }
}


/*
Recursion:
time complexity: O(m+n)
space complexity: O(m+n)
class Solution0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // base case
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        if (list1.val <= list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}
*/


public class _0021_MergeTwoSortedLists {

    public static void main(String[] args) {
        Solution0021 slt = new Solution0021();
        printLinkedList(slt.mergeTwoLists(createListNode(new int[]{1, 2, 4}), createListNode(new int[]{1, 3, 4})));  // 1 1 2 3 4 4
        printLinkedList(slt.mergeTwoLists(createListNode(new int[]{}), createListNode(new int[]{})));
        printLinkedList(slt.mergeTwoLists(createListNode(new int[]{}), createListNode(new int[]{0})));  // 0
    }


    public static void printLinkedList(ListNode node) {
        ListNode temp = node;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    public static ListNode createListNode(int[] arr) {
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        for (int i : arr) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return pre.next;
    }
}
