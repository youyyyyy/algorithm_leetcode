package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;


/*
 *           1              |   |           |   |             |   |       |   |
 *         /   \            |   |           |   |             |   |       |   |
 *        2     3           |   |           |   |             |   |       |   |
 *             /  \         |   |           | 2 |             |   |       | 4 |
 *            4    5        | 1 |           | 3 |             | 3 |       | 5 |
 *                       push 1, pop 1    push 3, push 2      pop 3     push 5, push 4
 *                                           pop 2                       pop 4, pop 5
 *                         {1}              {1,2}            {1,2,3}    {1,2,3,4,5}
 *
 *  (1) pop a node
 *  (2) add to list
 *  (3) push right, push left (if exist)
 *  (4) repeat (1) to (3)
 *
 * */
class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null) stack.add(temp.right);
            if (temp.left != null) stack.add(temp.left);
        }

        return res;
    }
}

public class _144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(5);

        root.left = t1;
        root.right = t2;
        t2.left = t3;
        t2.right = t4;

        Solution144 slt = new Solution144();
        List<Integer> res = slt.preorderTraversal(root);
        System.out.println(res);
    }
}
