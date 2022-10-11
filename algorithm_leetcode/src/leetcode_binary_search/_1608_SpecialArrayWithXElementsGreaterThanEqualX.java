package leetcode_binary_search;

import java.util.Arrays;

class Solution1608 {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int lo = 0, hi = len - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int count = len - mid;

            int leftBound = mid == 0 ? 0 : nums[mid - 1];
            if (count > leftBound && count <= nums[mid]) return count;
            else if (nums[mid] > count) hi = mid - 1;
            else lo = mid + 1;

        }

        return -1;
    }
}

public class _1608_SpecialArrayWithXElementsGreaterThanEqualX {
    public static void main(String[] args) {
        int[] nums = {0, 4, 3, 0, 4};
        Solution1608 slt = new Solution1608();
        int res = slt.specialArray(nums);
        System.out.println(res);
    }
}
