package leetcode_array;

class Solution0189 {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int shortLen = k % len;

        int[] temp = new int[shortLen];
        for (int i = 0; i < shortLen; i++) temp[i] = nums[len - shortLen + i];
        for (int i = len - 1; i >= 0; i--) {
            nums[i] = nums[(len - shortLen + i) % len];
        }

        for (int i = 0; i < shortLen; i++) nums[i] = temp[i];

    }
}

public class _0189_RotateArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 10;
        Solution0189 slt = new Solution0189();
        slt.rotate(nums, k);

        for (int num : nums) System.out.print(num + " ");
    }
}
