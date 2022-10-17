package leetcode_sliding_window;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */

class Solution0209 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0, right = 0;

        int sum = 0, res = Integer.MAX_VALUE;
        for (; right < nums.length; right++) {
            sum += nums[right];
            while (sum >= target) {
                res = Math.min(res, right - left + 1);
                sum -= nums[left++];
            }
        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

public class _0209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution0209 slt = new Solution0209();
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 7;
        int res = slt.minSubArrayLen(target, arr);
        System.out.println(res);

    }
}
