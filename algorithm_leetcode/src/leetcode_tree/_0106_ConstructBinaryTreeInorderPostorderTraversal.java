package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.HashMap;

class Solution0106 {
    private int post_idx; // index of last element in the postorder array
    private int[] postorder;
    private int[] inorder;
    private HashMap<Integer, Integer> map = new HashMap<>(); // to find index in the inorder array

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        post_idx = postorder.length - 1;
        this.inorder = inorder;
        this.postorder = postorder;

        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);
        return helper(0, inorder.length - 1);

    }

    private TreeNode helper(int in_left, int in_right) {
        if (in_left > in_right) return null;

        // the last val in postorder is the root
        int root_val = postorder[post_idx];
        TreeNode root = new TreeNode(root_val);

        int idx = map.get(root_val);

        post_idx--;
        root.right = helper(idx + 1, in_right);
        root.left = helper(in_left, idx - 1);
        return root;
    }
}

public class _0106_ConstructBinaryTreeInorderPostorderTraversal {
    public static void main(String[] args) {
        int[] inorder = {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};
        Solution0106 slt = new Solution0106();

    }
}
