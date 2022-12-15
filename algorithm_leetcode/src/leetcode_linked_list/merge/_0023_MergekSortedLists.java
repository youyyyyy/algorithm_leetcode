package leetcode_linked_list.merge;

import data_structure_class.ListNode;

/*
Solution 1: Brute Force
 - Time complexity: O(NlogN)
 - Space complexity: O(n)

class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> values = new ArrayList<>();

        // 1. collect all values of all lists
        for (ListNode list : lists) {
            while (list != null) {
                values.add(list.val);
                list = list.next;
            }
        }

        // 2. sort
        Collections.sort(values);

        // 3. Create result
        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        for (int i = 0; i < values.size(); i++) {
            cur.next = new ListNode(values.get(i));
            cur = cur.next;
        }

        return pre.next;
    }
}
*/


/*
Solution 2: Priority Queue
 - Time complexity: O(Nlogk)
 - Space complexity: O(n)
class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        // 1. using priority queue to keep the smallest value of each list
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode list : lists) {
            if (list != null) pq.add(list);
        }

        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while (!pq.isEmpty()) {
            ListNode temp = pq.poll();
            if (temp.next != null) pq.add(temp.next);
            cur.next = temp;
            cur = cur.next;
        }

        return pre.next;
    }
}
*/

/*
Solution 3: Merge two lists
 - Time complexity: O(Nk)
 - Space complexity: O(1)
class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode res = null;
        for (ListNode list : lists) {
            res = mergeTwoLists(res, list);
        }

        return res;
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode pre = new ListNode(-1);
        ListNode cur = pre;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        cur.next = l1 == null ? l2 : l1;

        return pre.next;
    }
}
*/

/*
 * Divide and Conquer
 * - Time complexity: O(Nlogk)
 * - Space complexity: O(1)
 * */
class Solution0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    private ListNode merge(ListNode[] lists, int lo, int hi) {
        if (lo == hi) return lists[lo];
        if (lo > hi) return null;

        int mid = lo + (hi - lo) / 2;
        return mergeTwoLists(merge(lists, lo, mid), merge(lists, mid + 1, hi));
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        ListNode pre = new ListNode(-1);
        ListNode cur = pre;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        cur.next = l1 == null ? l2 : l1;

        return pre.next;
    }
}

public class _0023_MergekSortedLists {
    public static void main(String[] args) {
        // list 1
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(5);
        n1.setNext(n2);
        n2.setNext(n3);

        // list 2
        ListNode n1_2 = new ListNode(1);
        ListNode n2_2 = new ListNode(3);
        ListNode n3_2 = new ListNode(4);
        n1_2.setNext(n2_2);
        n2_2.setNext(n3_2);

        // list 3
        ListNode n1_3 = new ListNode(2);
        ListNode n2_3 = new ListNode(6);
        n1_3.setNext(n2_3);

        ListNode[] list = {n1, n1_2, n1_3};
        Solution0023 slt = new Solution0023();
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
