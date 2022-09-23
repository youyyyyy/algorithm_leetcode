package leetcode_dynamic_programming;


import java.util.Arrays;


// Time complexity: O(m*n)
// Space complexity: O(m*n)
class Solution62 {
    public int uniquePaths(int m, int n) {
        if (m == 0 || n == 0) return 1;

        int[][] dp = new int[m + 1][n + 1];
        for (int[] arr : dp) Arrays.fill(arr, 1);

        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m][n];
    }
}

public class _62_UniquePaths {
    public static void main(String[] args) {
        Solution62 slt = new Solution62();
        int m = 3, n = 2;
        int res = slt.uniquePaths(m, n);
        System.out.println(res);
    }
}
