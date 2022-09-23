package leetcode_dynamic_programming;


// Time complexity: O(n)
// Space complexity: O(1)
class Solution70 {
    public int climbStairs(int n) {
        if (n == 1) return 1;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

public class _70_ClimbingStairs {
    public static void main(String[] args) {
        Solution70 slt = new Solution70();
        int res = slt.climbStairs(5);
        System.out.println(res);

    }
}
