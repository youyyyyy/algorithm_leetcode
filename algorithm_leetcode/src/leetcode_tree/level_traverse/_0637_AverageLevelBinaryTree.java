package leetcode_tree.level_traverse;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
DFS:
class Solution0637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        List<Integer> count = new ArrayList<>();

        dfs(root, 0, res, count);
        for (int i = 0; i < res.size(); i++) res.set(i, res.get(i) / count.get(i));

        return res;
    }

    private void dfs(TreeNode root, int level, List<Double> res, List<Integer> count) {
        if (root == null) return;

        if (res.size() == level) {
            res.add(root.val * 1.0);
            count.add(1);
        } else {
            res.set(level, res.get(level) + root.val);
            count.set(level, count.get(level) + 1);
        }

        dfs(root.left, level + 1, res, count);
        dfs(root.right, level + 1, res, count);
    }
}
*/

class Solution0637 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            long sum = 0;
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                sum += temp.val;
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res.add(sum * 1.0 / len);
        }

        return res;
    }
}

public class _0637_AverageLevelBinaryTree {
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

        Solution0637 slt = new Solution0637();
        List<Double> res = slt.averageOfLevels(root);
        System.out.println(res);
    }
}
