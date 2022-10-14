package leetcode_binary_search;


/*
 * consider three situations:
 * 1. nums[lo] < nums[mid] && nums[mid] < nums[hi] (not rotated) - min is in the left part, moving "hi" pointer toward "mid"
 * 2. nums[lo] > nums[mid] && nums[mid] < nums[hi]  (is rotated) - min is in the left part, moving "hi" pointer toward "mid"
 * 3. nums[lo] < nums[mid] && nums[mid] > nums[hi] (is rotated) - min is in the right part, moving "lo" pointer toward "mid"
 * thus, we can combine first two together:
 * 1. if nums[mid] < nums[hi], search left part
 * 2. if nums[mid] > nums[hi], search right part
 * */
class Solution0153 {
    public int findMin(int[] nums) {

        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] <= nums[hi]) hi = mid;
            else lo = mid + 1;
        }

        return nums[lo];
    }
}

public class _0153_FindMinimumRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        Solution0153 slt = new Solution0153();
        int res = slt.findMin(arr);
        System.out.println(res);
    }
}
