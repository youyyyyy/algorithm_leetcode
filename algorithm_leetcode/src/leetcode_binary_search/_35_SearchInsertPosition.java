package leetcode_binary_search;

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int lo = 0;
        int hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }
}

public class _35_SearchInsertPosition {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int target = 7;
        Solution35 slt = new Solution35();
        int res = slt.searchInsert(arr, target);
        System.out.println(res);

    }
}
