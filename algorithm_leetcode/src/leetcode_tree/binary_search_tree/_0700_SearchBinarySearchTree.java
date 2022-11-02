package leetcode_tree.binary_search_tree;

import fcc_code_example_recursion.TreeNode;


/*
class Solution0700 {
    public TreeNode searchBST(TreeNode root, int val) {

        while (root != null && root.val != val) {
            root = root.val > val ? root.left : root.right;
        }

        return root;
    }
}
*/

class Solution0700 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) return root;
        return root.val > val ? searchBST(root.left, val) : searchBST(root.right, val);
    }
}

public class _0700_SearchBinarySearchTree {
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

        Solution0700 slt = new Solution0700();
        int val = 6;
        TreeNode res = slt.searchBST(root, val);
    }
}
