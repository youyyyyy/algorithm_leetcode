package leetcode_binary_search;

class Solution33 {
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


    public int search2(int[] nums, int target) {
        // find pivot
        int pivot = 0;
        if (nums[0] > nums[nums.length - 1]) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    pivot = i + 1;
                    break;
                }
            }
        }

        if (pivot == 0) {
            return binSearch(nums, target, 0, nums.length - 1);
        } else {
            int half1 = binSearch(nums, target, 0, pivot - 1);
            if (half1 == -1) return binSearch(nums, target, pivot, nums.length - 1);
            return half1;
        }
    }

    public int binSearch(int[] nums, int target, int lo, int hi) {
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target > nums[mid]) {
                lo = mid + 1;
            } else {
                hi = hi - 1;
            }
        }
        return -1;
    }
}

public class _33_SearchRotatedSortedArray {
    public static void main(String[] args) {
        Solution33 slt = new Solution33();
        int[] arr = {3, 1};
        int res = slt.search(arr, 1);
        System.out.println(res);

    }
}
