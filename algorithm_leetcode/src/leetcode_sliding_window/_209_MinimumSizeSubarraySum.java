package leetcode_sliding_window;

class Solution209 {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int start = 0, end = 0;
        int sum = 0;
        for (; end < nums.length; end++) {
            sum += nums[end];
            while (sum >= target) {
                minLen = Math.min(minLen, end - start + 1);
                sum -= nums[start++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}

public class _209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution209 slt = new Solution209();
        int[] arr = {2, 3, 1, 2, 4, 3};
        int target = 100;
        int res = slt.minSubArrayLen(target, arr);
        System.out.println(res);

    }
}
