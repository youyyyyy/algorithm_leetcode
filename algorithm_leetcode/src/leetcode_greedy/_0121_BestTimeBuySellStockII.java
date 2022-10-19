package leetcode_greedy;

class Solution0121 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) maxProfit += prices[i] - prices[i-1];
        }

        return maxProfit;
    }
}

public class _0121_BestTimeBuySellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution0121 slt = new Solution0121();
        int res = slt.maxProfit(prices);
        System.out.println(res);
    }
}
