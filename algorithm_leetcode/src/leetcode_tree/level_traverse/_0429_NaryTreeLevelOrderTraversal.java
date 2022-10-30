package leetcode_tree.level_traverse;

import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}


/*
DFS:
class Solution0429 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        dfs(root, 0, res);

        return res;
    }

    private void dfs(Node root, int level, List<List<Integer>> res) {
        if (root == null) return;
        if (res.size() == level) res.add(new ArrayList<>());
        res.get(level).add(root.val);

        if (root.children != null) {
            for (Node child : root.children) dfs(child, level + 1, res);
        }
    }
}
*/

class Solution0429 {
    public List<List<Integer>> levelOrder(Node root) {

        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                Node temp = queue.poll();
                curLevel.add(temp.val);
                if (temp.children != null) queue.addAll(temp.children);
            }
            res.add(curLevel);
        }

        return res;
    }
}

public class _0429_NaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        Node root = new Node(1);
        Node t1 = new Node(3);
        Node t2 = new Node(2);
        Node t3 = new Node(4);
        Node t4 = new Node(5);
        Node t5 = new Node(6);

        root.children = new ArrayList<>(Arrays.asList(t1, t2, t3));
        t3.children = new ArrayList<>(Arrays.asList(t4, t5));

        Solution0429 slt = new Solution0429();
        List<List<Integer>> res = slt.levelOrder(root);
        System.out.println(res);
    }
}
