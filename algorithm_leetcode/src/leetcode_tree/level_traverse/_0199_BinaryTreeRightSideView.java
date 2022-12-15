package leetcode_tree.level_traverse;

import resources.fcc_code_example_recursion.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


/*
DFS:
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;

        dfs(root, 0, res);

        return res;
    }

    private void dfs(TreeNode root, int level, List<Integer> res) {
        if(root == null) return;
        if(res.size() == level) res.add(root.val);
        else res.set(level, root.val);

        dfs(root.left, level + 1, res);
        dfs(root.right, level + 1, res);
     }
}
*/


class Solution0199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode temp = queue.poll();
                if (i == len - 1) res.add(temp.val);
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
        }

        return res;
    }
}

public class _0199_BinaryTreeRightSideView {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(2);
        TreeNode t2 = new TreeNode(3);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(4);

        root.left = t1;
        root.right = t2;
        root.left.right = t3;
        root.right.right = t4;

        Solution0199 slt = new Solution0199();
        List<Integer> res = slt.rightSideView(root);
        System.out.println(res);
    }
}
