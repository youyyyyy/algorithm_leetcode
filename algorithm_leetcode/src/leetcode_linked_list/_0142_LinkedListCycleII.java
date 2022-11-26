package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

/*
Solution 1: HashSet
- Time complexity: O(N)
- Space complexity: O(N)
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

Deduction:
 - suppose we have a nodes in before cycle, b nodes in the cycle
 1. fast pointer moves two steps, slow pointer moves one step --> f = 2s
 2. when fast pointer catches slow pointer in the cycle, f = s + nb --> s = nb
 3. after first encounter, if s moves a steps, it will move to where cycle begins
 4. so let fast points to head, fast needs to move a steps to the entrance. slow also needs to move a steps to the entrance
    when fast and slow encounters again, they both points to the node where cycle begins
*/
class Solution0142 {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = findIntersection(head);
        if (slow == null) return null;

        ListNode fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return fast;
    }

    private ListNode findIntersection(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return slow;
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
