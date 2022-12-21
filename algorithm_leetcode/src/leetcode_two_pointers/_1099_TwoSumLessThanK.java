package leetcode_two_pointers;

import java.util.Arrays;


// Time complexity: O(nlogn)
// Space complexity: O(1)
class Solution1099 {
    public int twoSumLessThanK(int[] nums, int k) {
        int res = -1;
        Arrays.sort(nums);

        int i = 0, j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum >= k) {
                j--;
            } else {
                i++;
                res = Math.max(res, sum);
            }
        }

        return res;
    }
}

public class _1099_TwoSumLessThanK {
    public static void main(String[] args) {
        Solution1099 slt = new Solution1099();
        System.out.println(slt.twoSumLessThanK(new int[]{34, 23, 1, 24, 75, 33, 54, 8}, 60)); // 58
        System.out.println(slt.twoSumLessThanK(new int[]{10, 20, 30}, 15));  // -1
        System.out.println(slt.twoSumLessThanK(new int[]{
                        254, 914, 110, 900, 147, 441, 209, 122, 571, 942, 136, 350, 160, 127,
                        178, 839, 201, 386, 462, 45, 735, 467, 153, 415, 875, 282, 204, 534, 639,
                        994, 284, 320, 865, 468, 1, 838, 275, 370, 295, 574, 309, 268, 415, 385,
                        786, 62, 359, 78, 854, 944},
                200
        ));
    }
}
