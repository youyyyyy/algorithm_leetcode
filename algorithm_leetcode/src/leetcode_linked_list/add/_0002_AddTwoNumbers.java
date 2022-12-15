package leetcode_linked_list.add;

import data_structure_class.ListNode;

/*
Time complexity : O(max(m,n))
Space complexity : O(max(m,n))
*/

class Solution0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. build a new linked list, will return pre.next
        ListNode pre = new ListNode();
        ListNode cur = pre;

        // 2. initialize carry to 0
        int carry = 0;

        // 3. go through two linked lists
        while (l1 != null || l2 != null) {
            // 4. If they have different number of nodes, substitute with 0
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;

            // 5. calculate the sum, create a Node as cur.next, and update carry
            int sum = val1 + val2 + carry;
            cur.next = new ListNode(sum % 10);
            carry = sum / 10;

            // 6. cur move forward, l1 and l2 move forward if they are not null
            cur = cur.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        // 7. don't forget if after looping l1 and l2, carry is 1, add a new Node(1)
        if (carry == 1) cur.next = new ListNode(1);

        return pre.next;
    }
}

public class _0002_AddTwoNumbers {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(9);
        ListNode n3 = new ListNode(9);
        ListNode n4 = new ListNode(9);
        ListNode n5 = new ListNode(9);
        ListNode n6 = new ListNode(9);
        ListNode n7 = new ListNode(9);

        ListNode n1_2 = new ListNode(9);
        ListNode n2_2 = new ListNode(9);
        ListNode n3_2 = new ListNode(9);
        ListNode n4_2 = new ListNode(9);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        n5.setNext(n6);
        n6.setNext(n7);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);


        Solution0002 slt = new Solution0002();
        ListNode res = slt.addTwoNumbers(n1, n1_2);
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
