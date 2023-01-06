package leetcode_linked_list.reverse;

import data_structure_class.ListNode;


// Time complexity: O(n)
// Space complexity: O(1)

class Solution0234 {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null) return true;

        // 1. find the mid, and reverse the second half
        ListNode firstHalfEnd = findMiddle(head);
        ListNode secondHalfStart = reverse(firstHalfEnd.next);

        // 2. compare
        boolean res = true;
        ListNode curFirst = head;
        ListNode curSecond = secondHalfStart;
        while (curSecond != null) {
            if (curFirst.val != curSecond.val) res = false;
            curFirst = curFirst.next;
            curSecond = curSecond.next;
        }


        // 3. restore
        firstHalfEnd.next = reverse(secondHalfStart);

        return res;
    }


    /*
     * return the middle node, middle is defined as:
     * 1 -> 2 -> 3 return 2
     * 1 -> 2 -> 3 -> 4 return 2
     * This is a bit different from https://leetcode.com/problems/middle-of-the-linked-list/
     * */
    private ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;
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
        Solution0234 slt = new Solution0234();
        System.out.println(slt.isPalindrome(createListNode(new int[]{8, 2, 8})));  // true
        System.out.println(slt.isPalindrome(createListNode(new int[]{1, 2, 2, 1})));  // true
        System.out.println(slt.isPalindrome(createListNode(new int[]{1, 2})));  // false

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
