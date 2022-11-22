package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;


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
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(8);
        ListNode n3 = new ListNode(22);
        ListNode n4 = new ListNode(40);

        ListNode n1_2 = new ListNode(4);
        ListNode n2_2 = new ListNode(11);
        ListNode n3_2 = new ListNode(16);
        ListNode n4_2 = new ListNode(20);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);

        Solution0021 slt = new Solution0021();
        ListNode res = slt.mergeTwoLists(n1, n1_2);
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
