package leetcode_binary_search;


/*
 * Time complexity: O(logN)
 * Space complexity: O(1)
 * */

import java.util.Arrays;

class Solution0034 {
    public int[] searchRange(int[] nums, int target) {

        int len = nums.length;
        if (len == 0) return new int[]{-1, -1};

        // 1. if target exists, find the first position of target
        int firstPos = find(nums, 0, len - 1, target);
        if (nums[firstPos] != target) return new int[]{-1, -1};

        // 2. find the first element greater than target
        int lastPos = find(nums, firstPos, len - 1, target + 1);
        if (nums[lastPos] == target) lastPos = len - 1;
        else lastPos--;
        return new int[]{firstPos, lastPos};

    }

    private int find(int[] nums, int lo, int hi, int target) {
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] < target) lo = mid + 1;
            else hi = mid;
        }
        return lo;
    }
}

public class _0034_FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        Solution0034 slt = new Solution0034();
        int[] res = slt.searchRange(arr, target);
        System.out.println(Arrays.toString(res));
    }
}
