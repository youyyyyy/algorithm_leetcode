package leetcode_prefix_sum;

class Solution0724 {
    public int pivotIndex(int[] nums) {

        int sum = 0;
        for (int num : nums) sum += num;

        int leftSum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i >= 1) leftSum += nums[i - 1];
            if (leftSum == sum - leftSum - nums[i]) return i;
        }


        return -1;
    }
}

public class _0724_FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {2, -1, 1};
        Solution0724 slt = new Solution0724();
        int res = slt.pivotIndex(nums);
        System.out.println(res);
    }
}
