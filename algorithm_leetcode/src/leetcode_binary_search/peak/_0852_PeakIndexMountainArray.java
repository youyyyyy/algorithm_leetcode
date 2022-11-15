package leetcode_binary_search.peak;


/*
 * Time complexity: O(logN)
 * Space complexity: O(1)
 * */

class Solution0852 {
    public int peakIndexInMountainArray(int[] arr) {
        int lo = 0, hi = arr.length - 1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] < arr[mid + 1]) lo = mid + 1;
            else hi = mid;
        }

        return lo;
    }
}


public class _0852_PeakIndexMountainArray {
    public static void main(String[] args) {
        int[] arr = {0, 10, 5, 2};
        Solution0852 slt = new Solution0852();
        int res = slt.peakIndexInMountainArray(arr);
        System.out.println(res);
    }
}
