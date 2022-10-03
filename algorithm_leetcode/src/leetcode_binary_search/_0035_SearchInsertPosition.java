package leetcode_binary_search;


/*
 * Time complexity: O(logN)
 * Space complexity: O(1)
 * */

class Solution0035 {
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            // nums contains distinct values sorted in ascending order, if found, return mid
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }

        return lo;
    }
}

public class _0035_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        Solution0035 slt = new Solution0035();
        int res = slt.searchInsert(arr, target);
        System.out.println(res);

    }
}
