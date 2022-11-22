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
Solution 2: using API: https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html
class Solution0704 {
    public int search(int[] nums, int target) {
        int res = Arrays.binarySearch(nums, target);
        return res >= 0 ? res : -1;
    }
}
*/

/*
Solution 3: recursion
class Solution0704 {
    public int search(int[] nums, int target) {
        return biSearch(nums, target, 0, nums.length - 1);
    }

    private int biSearch(int[] nums, int target, int lo, int hi) {
        if (hi < lo) return -1;
        int mid = lo + (hi - lo) / 2;
        if (nums[mid] == target) return mid;
        else if (nums[mid] > target) return biSearch(nums, target, lo, mid - 1);
        else return biSearch(nums, target, mid + 1, hi);
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
