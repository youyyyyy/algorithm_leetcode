package leetcode_tree.level_traverse;

class Node0116 {
    public int val;
    public Node0116 left;
    public Node0116 right;
    public Node0116 next;

    public Node0116() {
    }

    public Node0116(int _val) {
        val = _val;
    }

    public Node0116(int _val, Node0116 _left, Node0116 _right, Node0116 _next) {
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
class Solution0116 {
    public Node0116 connect(Node0116 root) {
        if (root == null) return null;

        Queue<Node0116> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node0116 cur = queue.poll();
                if (i < len - 1) cur.next = queue.peek();
                if (cur.left != null) queue.add(cur.left);
                if (cur.right != null) queue.add(cur.right);
            }
        }

        return root;
    }
}
*/

class Solution0116 {
    public Node0116 connect(Node0116 root) {
        Node0116 res = root;
        Node0116 prev;
        Node0116 leftMost = root;
        boolean isLeftMost = false;

        while (root != null) {
            if (isLeftMost) {
                leftMost = root;
                isLeftMost = false;
            }
            if (root.left != null) {
                prev = root.next;
                root.left.next = root.right;
                root.right.next = prev == null ? null : prev.left;
            }

            if (root.next == null) {
                isLeftMost = true;
                root = leftMost.left;
            } else {
                root = root.next;
            }
        }

        return res;
    }
}


public class _0116_PopulatingNextRightPointersEachNode {
    public static void main(String[] args) {
        Node0116 root = new Node0116(1);
        Node0116 t1 = new Node0116(2);
        Node0116 t2 = new Node0116(3);
        Node0116 t3 = new Node0116(4);
        Node0116 t4 = new Node0116(5);
        Node0116 t5 = new Node0116(6);
        Node0116 t6 = new Node0116(7);

        root.left = t1;
        root.right = t2;
        root.left.left = t3;
        root.left.right = t4;
        root.right.left = t5;
        root.right.right = t6;

        Solution0116 slt = new Solution0116();
        Node0116 res = slt.connect(root);
    }
}
