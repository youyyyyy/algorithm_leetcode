package leetcode_sliding_window;

import java.util.HashSet;

class Solution1695 {
    public int maximumUniqueSubarray(int[] nums) {
        int res = 0;

        HashSet<Integer> set = new HashSet<>();
        int left = 0, right = 0;
        int sum = 0;
        for (; right < nums.length; right++) {
            int numRight = nums[right];
            while (set.contains(numRight)) {
                sum -= nums[left];
                set.remove(nums[left++]);
            }
            set.add(numRight);
            sum += numRight;
            res = Math.max(res, sum);

        }

        return res;

    }
}

public class _1695_MaximumErasureValue {
    public static void main(String[] args) {
        Solution1695 slt = new Solution1695();
        System.out.println(slt.maximumUniqueSubarray(new int[]{4, 2, 4, 5, 6}));  // 17
        System.out.println(slt.maximumUniqueSubarray(new int[]{5, 2, 1, 2, 5, 2, 1, 2, 5}));  // 8
    }
}
