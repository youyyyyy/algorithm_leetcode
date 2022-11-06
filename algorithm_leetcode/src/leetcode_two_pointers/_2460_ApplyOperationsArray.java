package leetcode_two_pointers;

class Solution2460 {
    public int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] *= 2;
                nums[i + 1] = 0;
            }
        }

        // see 283.https://leetcode.com/problems/move-zeroes/
        moveZeroes(nums);

        return nums;
    }

    private void moveZeroes(int[] nums) {
        int left = 0, right = 0;
        for (; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }
}

public class _2460_ApplyOperationsArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 1, 1, 0};
        Solution2460 slt = new Solution2460();
        int[] res = slt.applyOperations(nums);
        for (int i : res) System.out.print(i + " ");

    }
}
