package leetcode_binary_search;


/*
* Time complexity: O(N)
* Space complexity: O(1)
* */
class Solution81 {
    public boolean search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return true;

            // total same as Problem 33 except this line
            while (nums[mid] == nums[lo] && mid != lo) lo++;

            if (nums[mid] >= nums[lo]) {
                if (target >= nums[lo] && target < nums[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[hi]) {
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }

            }
        }

        return false;

    }
}

public class _0081_SearchRotatedSortedArrayII {
    public static void main(String[] args) {
        Solution81 slt = new Solution81();
        int[] arr = {1, 0, 1, 1, 1};
        int target = 0;
        boolean res = slt.search(arr, target);
        System.out.println(res);

    }

}
