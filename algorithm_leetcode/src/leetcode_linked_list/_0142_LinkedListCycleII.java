package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;



/*
Solution 1: HashSet
Time complexity: O(N)
Space complexity: O(N)

class Solution0142 {

    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        while (head != null) {
            if (visited.contains(head)) return head;
            visited.add(head);
            head = head.next;
        }

        return null;
    }
}
 */

/*
Time complexity: O(N)
Space complexity: O(1)
*/

class Solution0142 {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = hasCycle(head);

        if (hasCycle(slow) == null) {
            return null;
        }
        else {
            ListNode fast = head;
            while(slow != fast) {
                slow = slow.next;
                fast = fast.next;
            }
            return slow;
        }
    }

    private ListNode hasCycle(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) return slow;
        }

        return null;
    }
}

public class _0142_LinkedListCycleII {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(3);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(0);
        ListNode n4 = new ListNode(-4);

        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n2);

        Solution0142 slt = new Solution0142();
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
