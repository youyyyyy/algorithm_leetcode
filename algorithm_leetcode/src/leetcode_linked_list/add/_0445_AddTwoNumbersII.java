package leetcode_linked_list.add;

import data_structure_class.ListNode;

import java.util.Stack;

/*
class Solution0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // 1. reverse
        l1 = reverse(l1);
        l2 = reverse(l2);

        // 2. add
        ListNode head = null;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int val1 = l1 == null ? 0 : l1.val;
            int val2 = l2 == null ? 0 : l2.val;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            // 3. build new list when adding
            head = new ListNode(sum % 10, head);
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        if (carry == 1) head = new ListNode(1, head);

        return head;

    }

    private ListNode reverse(ListNode head) {
        if (head.next == null) return head;

        ListNode cur = head;
        ListNode prev = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
*/


/*
 * Time complexity: O(max(m,n))
 * Space complexity: O(m+n)
 * */
class Solution0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1 != null) {
            stack1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) {
            stack2.push(l2.val);
            l2 = l2.next;
        }

        ListNode head = null;
        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            int val1 = stack1.isEmpty() ? 0 : stack1.pop();
            int val2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = val1 + val2 + carry;
            carry = sum / 10;

            // build new list
            head = new ListNode(sum % 10, head);
        }

        if (carry == 1) head = new ListNode(1, head);

        return head;
    }
}


public class _0445_AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(9);
        ListNode n2 = new ListNode(7);
        ListNode n3 = new ListNode(4);
        ListNode n4 = new ListNode(3);

        ListNode n1_2 = new ListNode(5);
        ListNode n2_2 = new ListNode(6);
        ListNode n3_2 = new ListNode(4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);

        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);

        Solution0445 slt = new Solution0445();
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
