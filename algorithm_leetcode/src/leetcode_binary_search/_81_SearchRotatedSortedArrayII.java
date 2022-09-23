package leetcode_binary_search;

// related Problem 33
// Consider [3,1,2,3,3,3,3], target = 2, nums[mid] == nums[lo] == nums[hi], but left half is not sorted

class Solution81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) return false;
        if (nums.length == 1) return nums[0] == target;

        int lo = 0, hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target == nums[mid]) return true;
            if (nums[mid] == nums[lo] && nums[mid] == nums[hi]) { // cannot tell which side is sorted
                lo++;
                hi--;
            } else if (nums[mid] >= nums[lo]) { // left side is sorted
                if (target >= nums[lo] && target <= nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else { // right side is sorted
                if (target >= nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
        }
        return false;

    }
}

public class _81_SearchRotatedSortedArrayII {
    public static void main(String[] args) {
        Solution81 slt = new Solution81();
        int[] arr = {3, 1};
        int target = 1;
        boolean res = slt.search(arr, target);
        System.out.println(res);

    }

}
