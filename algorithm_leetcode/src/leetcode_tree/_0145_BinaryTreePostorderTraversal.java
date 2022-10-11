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
        if (root == null) return res;

        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);

        return res;
    }
}
*/


/*
 * Iterative:
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0145 {
    public List<Integer> postorderTraversal(TreeNode root) {  // left -> right -> head

        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);
        while (!s1.isEmpty()) {  // push all the nodes to s2 : head -> right -> left
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
        TreeNode t6 = new TreeNode(6);
        TreeNode t7 = new TreeNode(7);

        root.left = t2;
        root.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;

        Solution0145 slt = new Solution0145();
        List<Integer> res = slt.postorderTraversal(root);
        System.out.println(res); // [4, 5, 2, 6, 7, 3, 1]
    }
}
