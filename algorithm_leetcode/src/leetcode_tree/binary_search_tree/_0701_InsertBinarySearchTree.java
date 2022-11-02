package leetcode_tree.binary_search_tree;

import fcc_code_example_recursion.TreeNode;

class Solution0701 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        if (val < root.val) root.left = insertIntoBST(root.left, val);
        else root.right = insertIntoBST(root.right, val);

        return root;
    }
}

public class _0701_InsertBinarySearchTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(7);

        root.left = t1;
        root.left.left = t2;
        root.left.right = t3;
        root.right = t4;

        Solution0701 slt = new Solution0701();
        int val = 5;
        TreeNode res = slt.insertIntoBST(root, val);

    }
}
