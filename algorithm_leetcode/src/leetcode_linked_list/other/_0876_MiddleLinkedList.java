package leetcode_linked_list.other;

import data_structure_class.ListNode;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0876 {
    public ListNode middleNode(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}

public class _0876_MiddleLinkedList {

    public static void main(String[] args) {
        Solution0876 slt = new Solution0876();
        System.out.println(slt.middleNode(createListNode(new int[]{1, 2, 3, 4, 5})).val);  // 3
        System.out.println(slt.middleNode(createListNode(new int[]{1, 2, 3, 4, 5, 6})).val);  // 4
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
