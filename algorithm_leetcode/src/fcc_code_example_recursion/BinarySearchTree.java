/*
 * Code example from Ryan Schachte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=IJDJ0kBx2LM
 * */

package fcc_code_example_recursion;

import java.util.List;

public class BinarySearchTree {

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

    public static void printLeaf(TreeNode root) {
        if (root == null) return;

        // check if the node is a leaf
        if (root.left == null && root.right == null) {
            System.out.print(root.val + " ");
            return;
        }

        if (root.left != null) {
            printLeaf(root.left);
        }
        if (root.right != null) {
            printLeaf(root.right);
        }
    }

    public static void main(String[] args) {
        List<Integer> dataInput = List.of(100, 80, 50, 90, 30, 60, 90, 85, 95, 120, 110, 108, 115, 140, 150);

        TreeNode root = null;
        for (Integer node : dataInput) {
            root = insertNode(root, node);
        }
        printLeaf(root);
    }
}
