package leetcode_recursion.tree;

import fcc_code_example_recursion.TreeNode;

/*
 * "Top-down" Solution - can be considered as a kind of preorder traversal
 * in each recursive call, we will visit the node first to come up with some values,
 * and pass these values to its children when calling the function recursively.
 * 1. return specific value for null node
 * 2. update the answer if needed
 * 3. left_ans = top_down(root.left, left_params)
 * 4. right_ans = top_down(root.right, right_params)
 * 5. return the answer if needed
 * */

class Solution0104_topDown {

    private int res = 0;

    public int maxDepth(TreeNode root) {

        if (root == null) return res;
        dfs(root, 1);
        return res;
    }

    private void dfs(TreeNode root, int level) {
        // 1. return specific value for null node
        if (root == null) return;
        // 2. update the answer if needed
        if (root.left == null && root.right == null) res = Math.max(res, level);

        // 3. left_ans = top_down(root.left, left_params)
        dfs(root.left, level + 1);
        // 4. right_ans = top_down(root.right, right_params)
        dfs(root.right, level + 1);
    }
}

/*
 * "Bottom-up" Solution - can be regarded as a kind of postorder traversal.
 * In each recursive call, we will firstly call the function recursively for all the children nodes
 * and then come up with the answer according to the returned values and the value of the current node itself.
 * 1. return specific value for null node
 * 2. left_ans = botton_up(root.left)
 * 3. right_ans = bottom_up(root.right)
 * 4. return answers
 * */

class Solution0104_bottomUp {
    public int maxDepth(TreeNode root) {

        // 1. return specific value for null node
        if (root == null) return 0;
        // 2. left_ans = botton_up(root.left)
        int leftMax = maxDepth(root.left);
        // 3. right_ans = bottom_up(root.right)
        int rightMax = maxDepth(root.right);
        // 4. return answers
        return Math.max(leftMax, rightMax) + 1;
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

        Solution0104_topDown slt1 = new Solution0104_topDown();
        int res1 = slt1.maxDepth(root);
        System.out.println(res1);

        Solution0104_bottomUp slt2 = new Solution0104_bottomUp();
        int res2 = slt2.maxDepth(root);
        System.out.println(res2);
    }
}
