package leetcode_greedy;

import java.util.Arrays;

class Solution1833 {
    public int maxIceCream(int[] costs, int coins) {
        Arrays.sort(costs);

        int res = 0;
        for (int cost : costs) {
            coins -= cost;
            if (coins >= 0) res++;
            else break;
        }

        return res;
    }
}

public class _1833_MaximumIceCreamBars {
    public static void main(String[] args) {
        Solution1833 slt = new Solution1833();
        System.out.println(slt.maxIceCream(new int[]{1, 3, 2, 4, 1}, 7));
        System.out.println(slt.maxIceCream(new int[]{10, 6, 8, 7, 7, 8}, 5));
        System.out.println(slt.maxIceCream(new int[]{1, 6, 3, 1, 2, 5}, 20));
    }
}
