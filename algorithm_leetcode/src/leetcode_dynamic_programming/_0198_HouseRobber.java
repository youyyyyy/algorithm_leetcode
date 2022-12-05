package leetcode_dynamic_programming;


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];

        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }

        return dp[len - 1];
    }
}

/*
Optimized Bottom-up:
- Time complexity: O(n)
- Space complexity: O(1)
class Solution0198 {
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];

        int res = 0;
        int prev1 = 0;
        int prev2 = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res = Math.max(prev2, prev1 + nums[i]);
            prev1 = prev2;
            prev2 = res;
        }

        return res;
    }
}
*/

/*
Top-Down (Memoization):
- Time complexity: O(n)
- Space complexity: O(n)
class Solution0198 {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(1, nums[0]);
        memo.put(2, Math.max(nums[0], nums[1]));
        return helper(nums.length, nums, memo);
    }

    private int helper(int n, int[] nums, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        memo.put(n, Math.max(helper(n - 1, nums, memo), helper(n - 2, nums, memo) + nums[n - 1]));
        return memo.get(n);
    }
}
*/


public class _0198_HouseRobber {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        Solution0198 slt = new Solution0198();
        int res = slt.rob(nums);
        System.out.println(res);
    }
}
