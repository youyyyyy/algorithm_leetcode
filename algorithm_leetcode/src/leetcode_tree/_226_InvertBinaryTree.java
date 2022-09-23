package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.List;

class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;
        TreeNode temp = invertTree(root.left);
        root.left = invertTree(root.right);
        root.right = temp;
        return root;
    }
}

public class _226_InvertBinaryTree {

    public static void main(String[] args) {
        List<Integer> dataInput = List.of(4, 2, 7, 1, 3, 6, 9);

        TreeNode root = null;
        for (Integer node : dataInput) {
            root = insertNode(root, node);
        }
    }


    public static TreeNode insertNode(TreeNode head, int data) {

        // base case
        if (head == null) {
            head = new TreeNode();
            head.val = data;
            return head;
        }

        if (head.val < data) {
            head.right = insertNode(head.right, data);
        } else {
            head.left = insertNode(head.left, data);
        }

        return head;
    }
}
