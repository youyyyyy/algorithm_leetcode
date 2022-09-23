package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;


// Time complexity: O(M+N)
// Space complexity: O(1)
class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode curA = headA;
        ListNode curB = headB;

        while (curA != curB) {
            curA = curA == null ? headB : curA.next;
            curB = curB == null ? headA : curB.next;
        }
        return curA;
    }
}

public class _160_IntersectionTwoLinkedLists {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);

        ListNode n1_2 = new ListNode(1);
        ListNode n2_2 = new ListNode(1);
        ListNode n3_2 = new ListNode(1);

        ListNode intersection1 = new ListNode(5);
        ListNode intersection2 = new ListNode(6);
        ListNode intersection3 = new ListNode(7);

        n1.setNext(n2);
        n2.setNext(n3);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);

        intersection1.setNext(intersection2);
        intersection2.setNext(intersection3);

        n3.setNext(intersection1);
        n3_2.setNext(intersection1);

        Solution160 slt = new Solution160();
        ListNode res = slt.getIntersectionNode(n1, n1_2);
        System.out.println(res.val);

    }

}
