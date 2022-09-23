package leetcode_binary_search;

class Solution153 {
    public int findMin(int[] nums) {
        if (nums.length == 1) return nums[0];
        int min = nums[0];
        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= nums[lo]) {  // left side is sorted
                min = Math.min(nums[lo], min);
                lo = mid + 1;
            } else {  // right side is sorted
                min = Math.min(nums[mid], min);
                hi = mid - 1;
            }
        }
        return min;
    }

    // optimized:
    //
    //       5
    //    4
    // 3
    //               2
    //           1
    // (1) nums on the left side of minimum > last num
    // (2) nums on the right side of minimum < last num

    public int findMin2(int[] nums) {
        if (nums.length == 1) return nums[0];
        int lo = 0, hi = nums.length - 1;
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < nums[hi]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return nums[lo];
    }

}

public class _153_FindMinimumRotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        Solution153 slt = new Solution153();
        int res = slt.findMin2(arr);
        System.out.println(res);
    }
}
