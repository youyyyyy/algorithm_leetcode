package leetcode_tree;

import fcc_code_example_recursion.TreeNode;


class Solution0101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return dfs(root.left, root.right);
    }

    private boolean dfs(TreeNode left, TreeNode right) {
        if (left == null && right == null) return true;
        else if (left == null || right == null) return false;
        else if (left.val != right.val) return false;

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
