package leetcode_sliding_window;

import java.util.HashSet;


// Time complexity: O(n)
// Space complexity: O(min(n,k))
class Solution219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for (int right = 0; right < nums.length; right++) {

            int temp = nums[right];
            if (set.contains(temp)) return true;

            set.add(temp);
            if (set.size() > k) {
                set.remove(nums[right - k]);
            }
        }

        return false;
    }
}

public class _219_ContainsDuplicateII {
    public static void main(String[] args) {
        Solution219 slt = new Solution219();
        int[] nums = {1, 2, 3, 1, 2, 3};
        int k = 2;
        boolean res = slt.containsNearbyDuplicate(nums, k);
        System.out.println(res);

    }
}
