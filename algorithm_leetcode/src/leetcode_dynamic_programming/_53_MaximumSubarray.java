package leetcode_dynamic_programming;


// Time complexity: O(N)
// Space complexity: O(1)
class Solution53 {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) return nums[0];

        int res = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : nums) {
            sum = sum <= 0 ? num : sum + num;
            res = Math.max(sum, res);
        }

        return res;
    }
}

public class _53_MaximumSubarray {
    public static void main(String[] args) {
        int[] arr = {5, 4, -1, 7, 8};
        Solution53 slt = new Solution53();
        int res = slt.maxSubArray(arr);
        System.out.println(res);
    }
}
