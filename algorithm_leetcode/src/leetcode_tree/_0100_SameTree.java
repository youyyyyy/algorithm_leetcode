package leetcode_tree;

import fcc_code_example_recursion.TreeNode;


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null) return true;
        if (p == null || q == null) return false;
        if (p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }
}

public class _0100_SameTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);

        TreeNode root_2 = new TreeNode(1);
        TreeNode t1_2 = new TreeNode(2);
        TreeNode t2_2 = new TreeNode(3);

        root.left = t1;
        root.right = t2;

        root_2.left = t1_2;
        root_2.right = t2_2;

        Solution0100 slt = new Solution0100();
        boolean res = slt.isSameTree(root, root_2);
        System.out.println(res);
    }
}
