package leetcode_tree.level_traverse;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
DFS:
class Solution0515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        dfs(root, 0, res);

        return res;
    }

    private void dfs(TreeNode root, int level, List<Integer> res) {
        if (root == null) return;
        if (res.size() == level) res.add(Integer.MIN_VALUE);
        res.set(level, Math.max(res.get(level), root.val));

        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }
}
*/

class Solution0515 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                max = Math.max(max, temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res.add(max);
        }

        return res;
    }
}

public class _0515_FindLargestValueEachTreeRow {
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

        Solution0515 slt = new Solution0515();
        List<Integer> res = slt.largestValues(root);
        System.out.println(res);
    }
}
