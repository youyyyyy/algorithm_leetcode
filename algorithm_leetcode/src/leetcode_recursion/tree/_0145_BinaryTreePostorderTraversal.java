package leetcode_recursion.tree;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;

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
