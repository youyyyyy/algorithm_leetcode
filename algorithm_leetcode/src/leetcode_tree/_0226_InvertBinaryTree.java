package leetcode_tree;

import resources.fcc_code_example_recursion.TreeNode;

/*
Iterative:

class Solution {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) return null;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur = queue.poll();
            TreeNode temp = cur.left;
            cur.left = cur.right;
            cur.right = temp;

            if (cur.left != null) queue.add(cur.left);
            if (cur.right != null) queue.add(cur.right);
        }

        return root;
    }
}
*/

class Solution0226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}

public class _0226_InvertBinaryTree {
    public static void main(String[] args) {

    }
}
