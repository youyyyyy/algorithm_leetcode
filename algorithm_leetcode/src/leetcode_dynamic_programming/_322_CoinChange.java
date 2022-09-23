package leetcode_dynamic_programming;

import java.util.Arrays;

class Solution322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i < amount + 1; i++) {
            for (int coin : coins) {
                if (coin <= i) dp[i] = Math.min(dp[i], dp[i - coin] + 1);
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
}

public class _322_CoinChange {
    public static void main(String[] args) {
        Solution322 slt = new Solution322();
        int[] coins = {1, 2, 5};
        int amount = 11;
        int res = slt.coinChange(coins, amount);
        System.out.println(res);
    }
}
