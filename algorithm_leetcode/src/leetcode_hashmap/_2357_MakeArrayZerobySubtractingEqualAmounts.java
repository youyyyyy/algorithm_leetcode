package leetcode_hashmap;

import java.util.HashSet;

class Solution2357 {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num != 0) set.add(num);
        }
        return set.size();
    }
}


public class _2357_MakeArrayZerobySubtractingEqualAmounts {
    public static void main(String[] args) {
        int[] nums = {0};
        Solution2357 slt = new Solution2357();
        int res = slt.minimumOperations(nums);
        System.out.println(res);

    }
}
