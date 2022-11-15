package leetcode_array;

class Solution2210 {
    public int countHillValley(int[] nums) {
        int res = 0;
        int leftNeighbour = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] > leftNeighbour && nums[i] > nums[i + 1]
                    || nums[i] < leftNeighbour && nums[i] < nums[i + 1]) {
                res++;
                leftNeighbour = nums[i];
            }
        }

        return res;
    }
}

public class _2210_CountHillsValleysArray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 1, 6, 5};
        Solution2210 slt = new Solution2210();
        int res = slt.countHillValley(nums);
        System.out.println(res);
    }
}
