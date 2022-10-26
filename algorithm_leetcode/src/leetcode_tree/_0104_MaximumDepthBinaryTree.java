package leetcode_tree;

import fcc_code_example_recursion.TreeNode;

/*
BFS:
class Solution0104 {
    public int maxDepth(TreeNode root) {

        int res = 0;
        if (root == null) return res;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int count = queue.size();
            for (int i = 0; i < count; i++) {
                TreeNode temp = queue.poll();
                if (temp.left != null) queue.add(temp.left);
                if (temp.right != null) queue.add(temp.right);
            }
            res++;
        }

        return res;
    }
}
*/


class Solution0104 {
    public int maxDepth(TreeNode root) {

        if (root == null) return 0;

        // when the result back to root, add root itself
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}

public class _0104_MaximumDepthBinaryTree {
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

        Solution0104 slt = new Solution0104();
        int res = slt.maxDepth(root);
        System.out.println(res);
    }
}
