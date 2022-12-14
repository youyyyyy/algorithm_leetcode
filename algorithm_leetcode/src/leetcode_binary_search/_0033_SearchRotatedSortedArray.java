package leetcode_binary_search;

/*
* Time complexity: O(logN)
* Space complexity: O(1)
* */
class Solution0033 {
    public int search(int[] nums, int target) {

        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            if (nums[mid] >= nums[lo]) {  // left sorted portion
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {  // right sorted portion
                if (target > nums[mid] && target <= nums[hi]) {
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
