package leetcode_dynamic_programming;

class Solution0122 {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int res = 0;

        for (int price : prices) {
            if (price > buy) res += price - buy;
            buy = price;
        }

        return res;
    }
}

public class _0122_BestTimeBuySellStockII {
    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution0122 slt = new Solution0122();
        int res = slt.maxProfit(prices);
        System.out.println(res);
    }
}
