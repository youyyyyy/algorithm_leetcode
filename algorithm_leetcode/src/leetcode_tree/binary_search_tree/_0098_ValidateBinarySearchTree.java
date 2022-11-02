package leetcode_tree.binary_search_tree;

import fcc_code_example_recursion.TreeNode;



/*
Inorder traverse (Recursive)
class Solution0098 {
    private long minValue = Long.MIN_VALUE;

    public boolean isValidBST(TreeNode root) {
        return inorder(root);
    }

    private boolean inorder(TreeNode root) {
        if (root == null) return true;
        if (!inorder(root.left)) return false;

        // inorder traverse in BST should guarantee values are in ascending order
        if (root.val <= minValue) return false;
        minValue = root.val;

        return inorder(root.right);
    }
}
*/


/*
Inorder traverse (Iterative)
class Solution0098 {
    public boolean isValidBST(TreeNode root) {
        long minValue = Long.MIN_VALUE;

        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                if (root.val <= minValue) return false;
                else minValue = root.val;
                root = root.right;
            }
        }

        return true;
    }
}
*/

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
