package leetcode_tree.level_traverse;

import fcc_code_example_recursion.TreeNode;

import java.util.*;


/*
DFS:
class Solution0107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;
        dfs(root, 0, res);
        Collections.reverse(res);
        return res;
    }

    private void dfs(TreeNode root, int level, List<List<Integer>> res) {
        if(root == null) return;
        if (res.size() == level) res.add(new ArrayList<>());
        res.get(level).add(root.val);

        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
    }
}

*/


class Solution0107 {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> curLevel = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                curLevel.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res.add(curLevel);
        }

        Collections.reverse(res);
        return res;
    }
}

public class _0107_BinaryTreeLevelOrderTraversalII {
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

        Solution0107 slt = new Solution0107();
        List<List<Integer>> res = slt.levelOrderBottom(root);
        System.out.println(res);
    }
}
