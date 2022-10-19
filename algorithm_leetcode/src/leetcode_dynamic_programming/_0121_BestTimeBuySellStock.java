package leetcode_dynamic_programming;


/*
* Time complexity: O(n)
* Space complexity: O(1)
* */
class Solution0121 {
    public int maxProfit(int[] prices) {

        int maxProfit = 0;
        int minBuyPrice = Integer.MAX_VALUE;

        for (int price : prices) {
            minBuyPrice = Math.min(minBuyPrice, price);
            maxProfit = Math.max(price - minBuyPrice, maxProfit);
        }

        return maxProfit;
    }
}

public class _0121_BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 6, 4, 3, 1};
        Solution0121 slt = new Solution0121();
        int res = slt.maxProfit(arr);
        System.out.println(res);
    }
}
