package leetcode_two_pointers;

// Time complexity: O(n)
// Space complexity: O(1)
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 1) return 1;

        int left = 0, right = 1;
        for (; right < nums.length; right++) {
            if (nums[left] != nums[right]) {
                nums[++left] = nums[right];
            }
        }

        return left + 1;
    }
}

public class _26_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Solution26 slt = new Solution26();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int res = slt.removeDuplicates(arr);
        System.out.println(res);
    }
}
