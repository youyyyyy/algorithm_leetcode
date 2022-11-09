package leetcode_two_pointers.remove;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0026 {
    public int removeDuplicates(int[] nums) {
        int left = 1, right = 1;

        for (; right < nums.length; right++) {
            // all the elements before nums[left] are we kept in our result array
            // we check if the last element in the result equals to nums[right]
            if (nums[right] != nums[left - 1]) nums[left++] = nums[right];
        }

        return left;
    }
}

public class _0026_RemoveDuplicatesSortedArray {
    public static void main(String[] args) {
        Solution0026 slt = new Solution0026();
        int[] arr = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int res = slt.removeDuplicates(arr);
        System.out.println(res);
    }
}
