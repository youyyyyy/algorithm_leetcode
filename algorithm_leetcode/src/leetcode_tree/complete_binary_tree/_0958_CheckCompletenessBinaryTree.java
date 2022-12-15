package leetcode_tree.complete_binary_tree;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

class Solution0958 {
    public boolean isCompleteTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        boolean isLastLevel = false;

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();
            TreeNode left = temp.left;
            TreeNode right = temp.right;

            if (left == null && right != null) return false;
            else if (isLastLevel == false && (left == null || right == null)) isLastLevel = true;
            else if (isLastLevel == true && !(left == null && right == null)) return false;

            if (left != null) queue.add(left);
            if (right != null) queue.add(right);

        }

        return true;
    }
}

public class _0958_CheckCompletenessBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        TreeNode t6 = new TreeNode(6);

        root.left = t2;
        root.left.left = t4;
        root.left.right = t5;
        root.right = t3;
        root.right.left = t6;

        Solution0958 slt = new Solution0958();
        boolean res = slt.isCompleteTree(root);
        System.out.println(res);
    }
}
