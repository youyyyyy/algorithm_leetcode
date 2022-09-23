package leetcode_recursion;

import fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.List;

class Solution94 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new LinkedList<>();
        if (root == null) return res;
        res.addAll(inorderTraversal(root.left));
        res.add(root.val);
        res.addAll(inorderTraversal(root.right));
        return res;
    }
}

public class _94_BinaryTreeInorderTraversal {
}
