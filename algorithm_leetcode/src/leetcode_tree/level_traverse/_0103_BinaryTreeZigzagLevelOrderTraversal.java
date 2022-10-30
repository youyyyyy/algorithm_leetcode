package leetcode_tree.level_traverse;

import fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
DFS:
class Solution0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        dfs(root, 0, res);

        return res;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if (root == null) return;
        if (res.size() == level) res.add(new ArrayList<>());
        if (level % 2 == 0) res.get(level).add(root.val);
        else res.get(level).add(0, root.val);

        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }

}

*/

class Solution0103 {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int len = queue.size();
            List<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();

                if (res.size() % 2 == 0) curLevel.add(temp.val);
                else curLevel.add(0, temp.val);

                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res.add(curLevel);
        }

        return res;
    }
}

public class _0103_BinaryTreeZigzagLevelOrderTraversal {
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

        Solution0103 slt = new Solution0103();
        List<List<Integer>> res = slt.zigzagLevelOrder(root);
        System.out.println(res);
    }
}
