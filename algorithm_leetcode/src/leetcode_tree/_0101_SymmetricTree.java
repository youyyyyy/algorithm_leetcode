package leetcode_tree;

import resources.fcc_code_example_recursion.TreeNode;

/*
BFS:
class Solution0101 {
    public boolean isSymmetric(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode left = queue.poll();
            TreeNode right = queue.poll();
            if (left == null && right == null) continue;
            if (left == null || right == null) return false;
            if (left.val != right.val) return false;
            queue.add(left.left);
            queue.add(right.right);
            queue.add(left.right);
            queue.add(right.left);
        }

        return true;
    }
}
*/

class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        if (left == null || right == null) return false;
        if (left.val != right.val) return false;

        return dfs(left.left, right.right) && dfs(left.right, right.left);
    }
}

public class _0101_SymmetricTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(4);
        TreeNode t6 = new TreeNode(3);

        root.left = t1;
        root.left.left = t3;
        root.left.right = t4;

        root.right = t2;
        root.right.left = t5;
        root.right.right = t6;

        Solution0101 slt = new Solution0101();
        boolean res = slt.isSymmetric(root);
        System.out.println(res);
    }
}
