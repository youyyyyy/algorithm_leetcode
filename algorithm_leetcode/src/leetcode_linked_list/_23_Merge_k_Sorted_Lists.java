package leetcode_linked_list;

import fcc_code_example_recursion.ListNode;

import java.util.PriorityQueue;

class Solution23 {
    // Solution 1: brute force
    // Time Complexity: O(NlogN)
    // Space Complexity: O(N)
/*    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < lists.length; i++) {
            ListNode cur = lists[i];
            while (cur != null) {
                arr.add(cur.val);
                cur = cur.next;
            }
        }

        Collections.sort(arr);

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int i : arr) {
            ListNode temp = new ListNode(i);
            cur.next = temp;
            cur = cur.next;
        }

        return dummy.next;
    }*/

    // Solution 2: priority queue
/*    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> a.val - b.val);
        for (ListNode node : lists) {
            while (node != null) {
                queue.add(node);
                node = node.next;
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        while (!queue.isEmpty()) {
            cur.next = queue.poll();
            cur = cur.next;
            cur.next = null;
        }
        return dummy.next;
    }*/

    // Solution 3: merge two list
/*    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode node : lists) {
            res = mergeTwoLists(res, node);
        }
        return res;
    }

    public ListNode mergeTwoLists(ListNode n1, ListNode n2) {
        if (n1 == null) return n2;
        if (n2 == null) return n1;

        if (n1.val <= n2.val) {
            n1.next = mergeTwoLists(n1.next, n2);
            return n1;
        } else {
            n2.next = mergeTwoLists(n2.next, n1);
            return n2;
        }
    }*/


    // TODO: Solution 4: merge and conquer
    public ListNode mergeKLists(ListNode[] lists) {
        return null;
    }

}

public class _23_Merge_k_Sorted_Lists {
    public static void main(String[] args) {
        // list 1
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.setNext(n2);
        n2.setNext(n3);

        // list 2
        ListNode n1_2 = new ListNode(4);
        ListNode n2_2 = new ListNode(5);
        ListNode n3_2 = new ListNode(6);
        ListNode n4_2 = new ListNode(7);
        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);
        n3_2.setNext(n4_2);

        // list 3
/*        ListNode n1_3 = new ListNode(2);
        ListNode n2_3 = new ListNode(6);
        n1_3.setNext(n2_3);*/

        ListNode[] list = {n1, n1_2};
        Solution23 slt = new Solution23();
        ListNode res = slt.mergeKLists(list);
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
