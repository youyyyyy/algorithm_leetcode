package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.*;

class Solution0105 {
    private int prePos;
    private int[] preorder;
    private int[] inorder;
    private HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.prePos = 0;
        this.preorder = preorder;
        this.inorder = inorder;
        this.map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) map.put(inorder[i], i);

        return dfs(0, inorder.length - 1);
    }

    private TreeNode dfs(int par1, int par2) {
        if (par1 > par2) return null;

        int val = preorder[prePos];
        TreeNode root = new TreeNode(val);

        int idx = map.get(val);
        prePos++;
        root.left = dfs(par1, idx - 1);
        root.right = dfs(idx + 1, par2);

        return root;
    }
}

public class _0105_ConstructBinaryTreePreorderInorderTraversal {
    public static void main(String[] args) {
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        Solution0105 slt = new Solution0105();
        TreeNode res = slt.buildTree(preorder, inorder);

    }
}
