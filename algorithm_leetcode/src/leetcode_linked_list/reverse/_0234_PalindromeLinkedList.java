package leetcode_linked_list.reverse;

import data_structure_class.ListNode;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;

        boolean res = true;

        // 1. find the mid, and reverse the second half
        ListNode firstHalf = findMiddle(head);
        ListNode secondHalf = reverse(firstHalf.next);

        // 2. compare
        ListNode cur1 = head;
        ListNode cur2 = secondHalf;
        while (cur2 != null) {
            if (cur1.val != cur2.val) res = false;
            cur1 = cur1.next;
            cur2 = cur2.next;
        }

        // 3. restore
        firstHalf.next = reverse(secondHalf);

        return res;
    }


    /*
     * return the middle node, middle is defined as:
     * 1 -> 2 -> 3 return 1
     * 1 -> 2 -> 3 -> 4 return 2
     * This is a bit different from https://leetcode.com/problems/middle-of-the-linked-list/
     * because we'd better restore the second half. We should not modify the input
     * */
    private ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        return prev;
    }

    // reverse a list of nodes, see https://leetcode.com/problems/reverse-linked-list/
    private ListNode reverse(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prev = null;
        ListNode cur = head;

        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = prev;
            prev = cur;
            cur = temp;
        }

        return prev;
    }
}
/*
Time complexity: O(n)
Space complexity: O(n)

class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int left = 0, right = list.size() - 1;
        while (left < right) {
            if (list.get(left) != list.get(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}
*/

public class _0234_PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(8);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(8);

        n1.setNext(n2);
        n2.setNext(n3);

        Solution0234 slt = new Solution0234();
        boolean res = slt.isPalindrome(n1);
        System.out.println(res);

    }
}
