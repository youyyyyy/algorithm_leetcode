package leetcode_binary_search;

class Solution0033 {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return -1;

        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[lo]) {  // left side is sorted
                if (target >= nums[lo] && target <= nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {  // right side is sorted
                if (target >= nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return -1;
    }

}

public class _0033_SearchRotatedSortedArray {
    public static void main(String[] args) {
        Solution0033 slt = new Solution0033();
        int[] arr = {3, 1};
        int res = slt.search(arr, 1);
        System.out.println(res);

    }
}
