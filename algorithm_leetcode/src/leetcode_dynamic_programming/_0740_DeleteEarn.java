package leetcode_dynamic_programming;

import java.util.HashMap;


/*
Bottom-up (tabulation)
- Time complexity: O(n)
- Space complexity: O(n)

class Solution0740 {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + num);
            if (num > max) max = num;
        }

        int[] dp = new int[max + 1];
        dp[1] = map.getOrDefault(1, 0);
        for (int i = 2; i <= max; i++) {
            int points = map.getOrDefault(i, 0);
            dp[i] = Math.max(dp[i - 2] + points, dp[i - 1]);
        }

        return dp[max];
    }
}
*/

/*
 * Optimized Bottom-up:
 * - Time complexity: O(n + k)
 * - Space complexity: O(n + k)
 * */
class Solution0740 {
    public int deleteAndEarn(int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + num);
            if (num > max) max = num;
        }

        int prev1 = 0;
        int prev2 = map.getOrDefault(1, 0);
        int res = prev2;
        for (int i = 2; i <= max; i++) {
            res = Math.max(prev1 + map.getOrDefault(i, 0), prev2);
            prev1 = prev2;
            prev2 = res;
        }

        return res;
    }
}

public class _0740_DeleteEarn {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        Solution0740 slt = new Solution0740();
        int res = slt.deleteAndEarn(nums);
        System.out.println(res);
    }
}
