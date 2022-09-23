package leetcode_dynamic_programming;

class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int buy = prices[0], profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buy) {
                buy = prices[i];
            } else {
                profit = Math.max(prices[i] - buy, profit);
            }
        }
        return profit;
    }
}

public class _121_BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        Solution121 slt = new Solution121();
        int res = slt.maxProfit(arr);
        System.out.println(res);
    }
}
