package leetcode_dynamic_programming;

class Solution0746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
        }

        return Math.min(dp[len - 1], dp[len - 2]);
    }
}

public class _0746_MinCostClimbingStairs {
    public static void main(String[] args) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        Solution0746 slt = new Solution0746();
        int res = slt.minCostClimbingStairs(cost);
        System.out.println(res);
    }
}
