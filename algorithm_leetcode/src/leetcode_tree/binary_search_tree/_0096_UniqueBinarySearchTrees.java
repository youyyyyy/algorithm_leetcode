package leetcode_tree.binary_search_tree;

class Solution0096 {
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[j] * dp[i - j - 1];
            }
        }

        return dp[n];
    }
}

public class _0096_UniqueBinarySearchTrees {
    public static void main(String[] args) {
        int n = 3;
        Solution0096 slt = new Solution0096();
        int res = slt.numTrees(n);
        System.out.println(res);
    }
}
