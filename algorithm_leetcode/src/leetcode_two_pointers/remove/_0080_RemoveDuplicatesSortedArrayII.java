package leetcode_two_pointers.remove;


/*
 * Time comlexity: O(n)
 * Space complexity: O(1)
 * */
class Solution0080 {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        if (len <= 2) return len;

        int left = 2, right = 2;
        for (; right < nums.length; right++) {
            // all the elements before nums[left] are we kept in our result array
            // we check if the last two elements in the result equals to nums[right]
            if (nums[right] != nums[left - 2]) nums[left++] = nums[right];
        }

        return left;
    }
}


public class _0080_RemoveDuplicatesSortedArrayII {
    public static void main(String[] args) {
        Solution0080 slt = new Solution0080();
        int[] arr = {1, 1, 1, 2, 2, 3, 3};
        int res = slt.removeDuplicates(arr);
        System.out.println(res);
    }
}
