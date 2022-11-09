package leetcode_dynamic_programming;


/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0121 {
    public int maxProfit(int[] prices) {

        int buy = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < buy) buy = price;
            else if (price - buy > max) max = price - buy;
        }

        return max;
    }
}


public class _0121_BestTimeBuySellStock {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        Solution0121 slt = new Solution0121();
        int res = slt.maxProfit(arr);
        System.out.println(res);
    }
}
