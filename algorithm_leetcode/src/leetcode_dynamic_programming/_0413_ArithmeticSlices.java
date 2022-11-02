package leetcode_dynamic_programming;


/*
Time complexity: O(n)
Space complexity: O(n)
*/
class Solution0413 {
    public int numberOfArithmeticSlices(int[] nums) {
        int[] dp = new int[nums.length];
        int sum = 0;

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
                dp[i] = 1 + dp[i - 1];
                sum += dp[i];
            }
        }

        return sum;
    }
}

public class _0413_ArithmeticSlices {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Solution0413 slt = new Solution0413();
        int res = slt.numberOfArithmeticSlices(nums);
        System.out.println(res);

    }
}
