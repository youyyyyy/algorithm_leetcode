package leetcode_binary_search;


/*
* Time complexity: O(logN)
* Space complexity: O(1)
* */

class Solution0034 {
    public int[] searchRange(int[] nums, int target) {

        int[] res = {-1, -1};
        if (nums.length == 0) return res;

        // 1. find the first loc
        int lo = 0;
        int hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] >= target) hi = mid - 1;
            else lo = mid + 1;
        }

        // 2. if target is greater than all elements or target is not in the array, return
        if (lo == nums.length || nums[lo] != target) return res;

        int endLoc = lo;
        for (; endLoc < nums.length && nums[endLoc] == target; endLoc++) ;

        res[0] = lo;
        res[1] = endLoc - 1;

        return res;

    }
}

public class _0034_FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 10;
        Solution0034 slt = new Solution0034();
        int[] res = slt.searchRange(arr, target);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
