package leetcode_linked_list.other;

import data_structure_class.ListNode;

class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int sum = 0;
        while (head != null) {
            sum = sum * 2 + head.val;
            head = head.next;
        }
        return sum;
    }
}

public class _1290_ConvertBinaryNumberLinkedListInteger {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(0);
        ListNode n3 = new ListNode(1);

        n1.setNext(n2);
        n2.setNext(n3);

        Solution1290 slt = new Solution1290();
        int res = slt.getDecimalValue(n1);
        System.out.println(res);

    }
}
