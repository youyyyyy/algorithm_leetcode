package leetcode_binary_search;

/*
 * Time complexity: O(logn)
 * Space complexity: O(1)
 *  */
class Solution0704 {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) hi = mid - 1;
            else lo = mid + 1;
        }

        return -1;
    }
}


/*
using API:
class Solution {
    public int search(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        return res >= 0 ? res : -1;
    }
}
*/

public class _0704_BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
        Solution0704 slt = new Solution0704();
        int res = slt.search(nums, target);
        System.out.println(res);
    }
}
