package leetcode_tree.level_traverse;

class Node0117 {
    public int val;
    public Node0117 left;
    public Node0117 right;
    public Node0117 next;

    public Node0117() {
    }

    public Node0117(int _val) {
        val = _val;
    }

    public Node0117(int _val, Node0117 _left, Node0117 _right, Node0117 _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}

/*
Level Traverse:
- Time complexity: O(n)
- Space complexity: O(n)
class Solution0117 {
    public Node0117 connect(Node0117 root) {
        if (root == null) return null;

        Queue<Node0117> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node0117 cur = queue.poll();
                if (i < len - 1) cur.next = queue.peek();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
        }

        return root;
    }
}
*/

class Solution0117 {
    public Node0117 connect(Node0117 root) {
        if (root == null) return null;

        Node0117 cur = root; // when we are on current(Nth) level, we connect nodes on (N-1)th level

        while (cur != null) {
            Node0117 dummy = new Node0117(101);
            Node0117 prev = dummy; // we use prev to connect nodes on (N-1)th level
            while (cur != null) {
                if (cur.left != null) {
                    prev.next = cur.left;
                    prev = prev.next;
                }

                if (cur.right != null) {
                    prev.next = cur.right;
                    prev = prev.next;
                }
                cur = cur.next;
            }
            cur = dummy.next;

        }
        return root;
    }
}

public class _0117_PopulatingNextRightPointersEachNodeII {
    public static void main(String[] args) {
        Node0117 root = new Node0117(1);
        Node0117 t1 = new Node0117(2);
        Node0117 t2 = new Node0117(3);
        Node0117 t3 = new Node0117(4);
        Node0117 t4 = new Node0117(5);
        Node0117 t5 = new Node0117(6);
        Node0117 t6 = new Node0117(7);

        root.left = t1;
        root.right = t2;
        root.left.left = t3;
        root.left.right = t4;
        root.right.left = t5;
        root.right.right = t6;

        Solution0117 slt = new Solution0117();
        Node0117 res = slt.connect(root);
    }
}
