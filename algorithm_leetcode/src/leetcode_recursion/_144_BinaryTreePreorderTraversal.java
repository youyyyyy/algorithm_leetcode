package leetcode_recursion;

import fcc_code_example_recursion.TreeNode;
import java.util.LinkedList;
import java.util.List;

class Solution144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.add(root.val);
        res.addAll(preorderTraversal(root.left));
        res.addAll(preorderTraversal(root.right));
        return res;
    }
}

public class _144_BinaryTreePreorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);

        root.right = t1;
        t2.left = t2;

        Solution144 slt = new Solution144();
        List<Integer> res = slt.preorderTraversal(root);
        System.out.println(res);
    }
}
