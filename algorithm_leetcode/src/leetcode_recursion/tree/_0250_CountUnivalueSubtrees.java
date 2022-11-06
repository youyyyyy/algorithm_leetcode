package leetcode_recursion.tree;

import fcc_code_example_recursion.TreeNode;


/*
 * Bottom-up solution
 * Time complexity: O(n)
 * Space complexity: O(h)
 * */
class Solution0250_bottomUp {
    private int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        if (root == null) return 0;
        dfs(root);

        return count;
    }

    private boolean dfs(TreeNode root) {
        if (root.left == null && root.right == null) {
            count++;
            return true;
        }

        boolean isUnival = true;

        if (root.left != null) isUnival = dfs(root.left) && isUnival && (root.left.val == root.val);
        if (root.right != null) isUnival = dfs(root.right) && isUnival && (root.right.val == root.val);

        if (!isUnival) return false;

        count++;
        return true;
    }
}


class Solution0250__topDown {
    private int count = 0;

    public int countUnivalSubtrees(TreeNode root) {
        dfs(root, 0);
        return count;
    }

    private boolean dfs(TreeNode root, int val) {
        if (root == null) return true;
        if (!dfs(root.left, root.val) | !dfs(root.right, root.val)) return false;
        count++;
        return root.val == val;
    }
}


public class _0250_CountUnivalueSubtrees {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(5);
        TreeNode t5 = new TreeNode(5);

        root.left = t1;
        root.left.left = t2;
        root.left.right = t3;
        root.right = t4;
        root.right.right = t5;

        Solution0250_bottomUp slt = new Solution0250_bottomUp();
        int res = slt.countUnivalSubtrees(root);
        System.out.println(res);
    }
}
