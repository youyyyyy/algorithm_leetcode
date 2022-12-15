package leetcode_tree;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



/*
Recursive:
class Solution0144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        dfs(root.left, res);
        dfs(root.right, res);
    }
}
*/


/*
 * Iterative:
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0144 {
    public List<Integer> preorderTraversal(TreeNode root) { // node -> left -> right
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {  // while(!stack.empty())
            TreeNode temp = stack.pop();
            res.add(temp.val);
            if (temp.right != null) stack.push(temp.right);
            if (temp.left != null) stack.push(temp.left);
        }

        return res;
    }
}

public class _0144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);

        root.left = t2;
        root.left.left = t4;
        root.left.right = t5;
        root.right = t3;

        Solution0144 slt = new Solution0144();
        List<Integer> res = slt.preorderTraversal(root);
        System.out.println(res); // [1, 2, 4, 5, 3]
    }
}
