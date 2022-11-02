package leetcode_array;


class Solution2367 {
    public int arithmeticTriplets(int[] nums, int diff) {

        int res = 0;
        int[] lookup = new int[201]; // constraints: 0 <= nums[i] <= 200

        for (int num : nums) {
            if (num >= 2 * diff && (lookup[num - diff] == 1 && lookup[num - 2 * diff] == 1)) res++;
            lookup[num]++;
        }

        return res;

    }
}

public class _2367_NumberArithmeticTriplets {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        Solution2367 slt = new Solution2367();

        int res = slt.arithmeticTriplets(nums, diff);
        System.out.println(res);

    }
}
