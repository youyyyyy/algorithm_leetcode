package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

class Solution0110 {
    public boolean isBalanced(TreeNode root) {
        return helper(root) != -1;
    }

    private int helper(TreeNode root) {
        if (root == null) return 0;

        int left = helper(root.left);
        if (left == -1) return -1;

        int right = helper(root.right);
        if (right == -1) return -1;


        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }
}

public class _0110_BalancedBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);

        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        root.right.right = t4;

        Solution0110 slt = new Solution0110();
        boolean res = slt.isBalanced(root);
        System.out.println(res);
    }
}
