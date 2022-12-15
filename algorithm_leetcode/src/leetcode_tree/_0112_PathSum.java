package leetcode_tree;


import resources.fcc_code_example_recursion.TreeNode;

/*
BFS:
class Solution0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        Queue<Integer> valQueue = new LinkedList<>();

        nodeQueue.add(root);
        valQueue.add(root.val);

        while (!nodeQueue.isEmpty()) {
            TreeNode curNode = nodeQueue.poll();
            int curVal = valQueue.poll();
            if (curNode.left == null && curNode.right == null && curVal == targetSum) return true;

            if (curNode.left != null) {
                nodeQueue.add(curNode.left);
                valQueue.add(curVal + curNode.val);
            }

            if (curNode.right != null) {
                nodeQueue.add(curNode.right);
                valQueue.add(curVal + curNode.val);
            }
        }

        return false;
    }
}

*/

class Solution0112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {

        if (root == null) return false;

        targetSum -= root.val;
        if (root.left == null && root.right == null) return targetSum == 0;

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}

public class _0112_PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode t1 = new TreeNode(4);
        TreeNode t2 = new TreeNode(11);
        TreeNode t3 = new TreeNode(7);
        TreeNode t4 = new TreeNode(2);
        TreeNode t5 = new TreeNode(8);
        TreeNode t6 = new TreeNode(13);
        TreeNode t7 = new TreeNode(4);
        TreeNode t8 = new TreeNode(1);

        root.left = t1;
        root.left.left = t2;
        root.left.left.left = t3;
        root.left.left.right = t4;

        root.right = t5;
        root.right.left = t6;
        root.right.right = t7;
        root.right.right.right = t8;

        Solution0112 slt = new Solution0112();
        int target = 22;
        boolean res = slt.hasPathSum(root, target);
        System.out.println(res);
    }
}
