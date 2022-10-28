package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution0653 {
    public boolean findTarget(TreeNode root, int k) {
        List<Integer> values = new ArrayList<>();
        dfs(root, values);

        int left = 0, right = values.size() - 1;
        while (left < right) {
            int sum = values.get(left) + values.get(right);
            if (sum == k) return true;
            else if (sum < k) left++;
            else right--;
        }

        return false;
    }

    private void dfs(TreeNode root, List<Integer> values) {
        if (root == null) return;
        dfs(root.left, values);
        values.add(root.val);
        dfs(root.right, values);
    }
}

public class _0653_TwoSumIVInputBST {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(7);

        root.left = t1;
        root.left.left = t2;
        root.left.right = t3;

        root.right = t4;
        root.right.right = t5;

        Solution0653 slt = new Solution0653();
        int target = 9;
        boolean res = slt.findTarget(root, target);
        System.out.println(res);
    }
}
