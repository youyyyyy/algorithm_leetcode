package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                res.add(root.val);
                root = root.right;
            }
        }
        return res;
    }
}

public class _94_BinaryTreeInorderTraversal {
}
