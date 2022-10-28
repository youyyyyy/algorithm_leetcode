package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

class Solution0098 {
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long minValue, long maxValue) {
        if (root == null) return true;
        if (root.val <= minValue || root.val >= maxValue) return false;
        return helper(root.left, minValue, root.val) && helper(root.right, root.val, maxValue);
    }
}

public class _0098_ValidateBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(2);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(2);

        root.left = t1;
        root.right = t2;

        Solution0098 slt = new Solution0098();
        boolean res = slt.isValidBST(root);
        System.out.println(res);

    }
}
