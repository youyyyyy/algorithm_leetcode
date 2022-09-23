package leetcode_two_pointers;


// Time comlexity: O(n)
// Space complexity: O(1)
class Solution80 {
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int left = 1, right = 2;
        for (; right < nums.length; right++) {
            if (nums[left] != nums[right] || (nums[left] == nums[right] && nums[right] != nums[left - 1])) {
                nums[++left] = nums[right];
            }
        }

        return left + 1;
    }
}


public class _80_RemoveDuplicatesSortedArrayII {
    public static void main(String[] args) {
        Solution80 slt = new Solution80();
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        int res = slt.removeDuplicates(arr);
        System.out.println(res);
    }
}
