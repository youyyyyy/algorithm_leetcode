package leetcode_binary_search.peak;

class Solution0162 {
    public int findPeakElement(int[] nums) {
        int lo = 0, hi = nums.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[mid + 1]) hi = mid;
            else lo = mid + 1;

        }
        return lo;
    }
}

public class _0162_FindPeakElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 8, 7, 6, 5};
        Solution0162 slt = new Solution0162();
        int res = slt.findPeakElement(nums);
        System.out.println(res);
    }
}
