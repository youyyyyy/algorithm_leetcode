package leetcode_two_pointers;

import java.util.Arrays;

class Solution0259 {
    public int threeSumSmaller(int[] nums, int target) {
        int res = 0;
        int len = nums.length;
        Arrays.sort(nums);

        for (int i = 0; i < len - 1; i++) {
            int comp = target - nums[i];
            res += countCombination(nums, i + 1, len - 1, comp);
        }


        return res;
    }

    private int countCombination(int[] nums, int start, int end, int target) {
        int sum = 0;
        while (start < end) {
            int temp = nums[start] + nums[end];
            if (temp < target) {
                sum += end - start;
                start++;
            } else {
                end--;
            }
        }

        return sum;
    }
}

public class _0259_3SumSmaller {
    public static void main(String[] args) {
        int[] nums = {-2, 0, 1, 3};
        int target = 2;
        Solution0259 slt = new Solution0259();
        int res = slt.threeSumSmaller(nums, target);
        System.out.println(res);
    }
}
