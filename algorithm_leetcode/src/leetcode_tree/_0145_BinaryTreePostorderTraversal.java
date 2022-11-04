package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Recursive:
class Solution0145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        dfs(root, res);
        return res;
    }

    private void dfs(TreeNode root, List<Integer> res) {
        if(root == null) return;
        dfs(root.left, res);
        dfs(root.right, res);
        res.add(root.val);
    }
}
*/


/*
 * Iterative:
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0145 {
    public List<Integer> postorderTraversal(TreeNode root) {  // left -> right -> node

        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty()) {
            TreeNode temp = s1.pop();
            s2.push(temp);
            if (temp.left != null) s1.push(temp.left);
            if (temp.right != null) s1.push(temp.right);
        }

        while (!s2.isEmpty()) res.add(s2.pop().val);

        return res;
    }
}

public class _0145_BinaryTreePostorderTraversal {
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

        Solution0145 slt = new Solution0145();
        List<Integer> res = slt.postorderTraversal(root);
        System.out.println(res); // [4, 5, 2, 3, 1]
    }
}
