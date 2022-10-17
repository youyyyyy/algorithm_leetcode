package leetcode_two_pointers;

import java.util.Arrays;

class Solution2441 {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum == 0) return nums[right];
            else if (sum > 0) right--;
            else left++;
        }

        return -1;
    }
}

public class _2441_LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        int[] nums = {-1, 2, -3, 3};
        Solution2441 slt = new Solution2441();
        int res = slt.findMaxK(nums);
        System.out.println(res);
    }
}
