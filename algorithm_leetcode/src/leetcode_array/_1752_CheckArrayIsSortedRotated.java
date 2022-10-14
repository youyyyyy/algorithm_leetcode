package leetcode_array;


class Solution1752 {
    public boolean check(int[] nums) {
        if (nums.length == 1) return true;

        int len = nums.length;
        // the case of a > b can happen at most once
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (nums[i % len] > nums[(i + 1) % len]) count++;
        }

        return count <= 1;
    }
}

public class _1752_CheckArrayIsSortedRotated {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        Solution1752 slt = new Solution1752();
        boolean res = slt.check(nums);
        System.out.println(res);
    }
}
