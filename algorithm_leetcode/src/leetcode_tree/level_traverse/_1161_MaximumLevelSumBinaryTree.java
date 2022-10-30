package leetcode_tree.level_traverse;

import fcc_code_example_recursion.TreeNode;

import java.util.LinkedList;
import java.util.Queue;


/*
DFS:
class Solution1161 {

    int depth = 1;
    int[] levelSum = new int[10000];

    public int maxLevelSum(TreeNode root) {
        int res = 1;
        dfs(root, 1, levelSum);

        for (int i = 1; i <= depth; i++) res = levelSum[i] > levelSum[res] ? i : res;
        return res;
    }

    private void dfs(TreeNode root, int level, int[] levelSum) {
        if (root == null) return;
        levelSum[level] += root.val;
        depth = Math.max(depth, level);

        dfs(root.left, level + 1, levelSum);
        dfs(root.right, level + 1, levelSum);
    }
}
*/

class Solution1161 {
    public int maxLevelSum(TreeNode root) {
        int res = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int level = 1;
        while (!queue.isEmpty()) {
            int len = queue.size();
            int sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }

            if (sum > maxSum) {
                maxSum = sum;
                res = level;
            }

            level++;

        }

        return res;
    }
}

public class _1161_MaximumLevelSumBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode t1 = new TreeNode(9);
        TreeNode t2 = new TreeNode(20);
        TreeNode t3 = new TreeNode(15);
        TreeNode t4 = new TreeNode(7);

        root.left = t1;
        root.right = t2;
        root.right.left = t3;
        root.right.right = t4;

        Solution1161 slt = new Solution1161();
        int res = slt.maxLevelSum(root);
        System.out.println(res);
    }
}
