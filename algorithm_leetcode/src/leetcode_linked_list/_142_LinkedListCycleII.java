package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

class Solution142 {
/*
    Time complexity: O(N)
    Space complexity: O(N)
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null) {
            if(visited.contains(head)) return head;
            visited.add(head);
            head = head.next;
        }

        return null;
    }
 */


    // Time complexity: O(N)
    // Space complexity: O(1)
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) break;
        }

        if (fast != null && fast.next != null) {
            fast = head;
            while (fast != slow) {
                fast = fast.next;
                slow = slow.next;
            }
            return slow;
        }
        return null;
    }
}

public class _142_LinkedListCycleII {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n2);

        Solution142 slt = new Solution142();
        ListNode res = slt.detectCycle(n1);
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
