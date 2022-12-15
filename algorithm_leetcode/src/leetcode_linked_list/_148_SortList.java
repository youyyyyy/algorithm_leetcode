package leetcode_linked_list;

import data_structure_class.ListNode;

// TODO
class Solution148 {

    ListNode getMid(ListNode head) {
        ListNode midPrev = null;
        while (head != null && head.next != null) {
            midPrev = (midPrev == null) ? head : midPrev.next;
            head = head.next.next;
        }
        ListNode mid = midPrev.next;
        midPrev.next = null;
        return mid;
    }
}

public class _148_SortList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);


        Solution148 slt = new Solution148();
        ListNode res = slt.getMid(n1);
        System.out.println(res.val);
    }
}
