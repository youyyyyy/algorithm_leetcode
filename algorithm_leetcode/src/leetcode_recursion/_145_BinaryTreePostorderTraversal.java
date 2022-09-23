package leetcode_recursion;

import fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution145 {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;
        res.addAll(postorderTraversal(root.left));
        res.addAll(postorderTraversal(root.right));
        res.add(root.val);
        return res;
    }
}

public class _145_BinaryTreePostorderTraversal {
}
