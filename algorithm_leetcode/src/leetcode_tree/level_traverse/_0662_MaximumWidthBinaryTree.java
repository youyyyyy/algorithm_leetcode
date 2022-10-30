package leetcode_tree.level_traverse;

import fcc_code_example_recursion.TreeNode;

import java.util.*;

class Solution0662 {

    class myPair {
        private TreeNode node;
        private int index;

        myPair(TreeNode node, int index) {
            this.node = node;
            this.index = index;
        }

        int getIndex() {
            return index;
        }

        TreeNode getNode() {
            return node;
        }
    }

    public int widthOfBinaryTree(TreeNode root) {

        Queue<myPair> queue = new LinkedList<>();
        int maxWidth = Integer.MIN_VALUE;

        queue.add(new myPair(root, 1));
        while (!queue.isEmpty()) {
            int len = queue.size();
            int left = 0, right = 0;
            for (int i = 0; i < len; i++) {
                myPair temp = queue.poll();
                int idx = temp.getIndex();
                if (i == 0) left = idx;
                if (i == len - 1) right = idx;

                TreeNode cur = temp.getNode();
                if (cur.left != null) {
                    queue.add(new myPair(cur.left, idx * 2));
                }
                if (cur.right != null) {
                    queue.add(new myPair(cur.right, idx * 2 + 1));
                }
            }
            maxWidth = Math.max(right - left + 1, maxWidth);
        }

        return maxWidth;
    }
}


public class _0662_MaximumWidthBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(5);
        TreeNode t4 = new TreeNode(3);
        TreeNode t5 = new TreeNode(9);

        root.left = t1;
        root.right = t2;
        root.left.left = t3;
        root.left.right = t4;
        root.right.right = t5;

        Solution0662 slt = new Solution0662();
        int res = slt.widthOfBinaryTree(root);
        System.out.println(res);

    }
}
