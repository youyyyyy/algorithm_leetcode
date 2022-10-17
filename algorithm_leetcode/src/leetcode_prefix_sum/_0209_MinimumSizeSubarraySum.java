package leetcode_prefix_sum;


class Solution0209 {
    public int minSubArrayLen(int target, int[] nums) {

        int len = nums.length;
        int[] sums = new int[len + 1];

        sums[0] = 0;
        for (int i = 0; i < len; i++) sums[i + 1] = sums[i] + nums[i];

        int res = Integer.MAX_VALUE;
        for (int i = 0; i < sums.length; i++) {
            int lo = i + 1, hi = sums.length - 1;
            while (lo <= hi) {
                int mid = lo + (hi - lo) / 2;
                int temp = target + sums[i];
                if (sums[mid] >= temp) {
                    hi = mid - 1;
                    res = Math.min(res, mid - i);
                } else {
                    lo = mid + 1;
                }
            }

        }

        return res == Integer.MAX_VALUE ? 0 : res;
    }
}

public class _0209_MinimumSizeSubarraySum {
    public static void main(String[] args) {
        Solution0209 slt = new Solution0209();
        int[] arr = {1, 2, 3, 4, 5};
        int target = 15;
        int res = slt.minSubArrayLen(target, arr);
        System.out.println(res);

    }
}
