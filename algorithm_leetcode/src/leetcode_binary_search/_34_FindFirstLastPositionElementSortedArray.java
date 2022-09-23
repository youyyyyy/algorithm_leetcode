package leetcode_binary_search;

class Solution34 {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        if (nums == null || nums.length == 0) return res;

        int lo = 0, hi = nums.length - 1;

        // find the first position
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target <= nums[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        // if first position not exist, return {-1, -1}
        if (lo >= nums.length || nums[lo] != target) {
            return res;
        } else {
            res[0] = res[1] = lo;
        }

        // find the last position
        lo++;
        hi = nums.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (target >= nums[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        res[1] = hi;

        return res;

    }
}

public class _34_FindFirstLastPositionElementSortedArray {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 10;
        Solution34 slt = new Solution34();
        int[] res = slt.searchRange(arr, target);
        for (int i : res) {
            System.out.print(i + " ");
        }

    }
}
