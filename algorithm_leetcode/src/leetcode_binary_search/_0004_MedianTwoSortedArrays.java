package leetcode_binary_search;


// Time complexity: O(log (m+n))
// Space complexity: O(1)
class Solution0004 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        // 1. always binary search the array with smaller size
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        // 2. median1 is the max value of first half, median2 is the min value of the second half
        //    For even length, median is median2
        //    For odd length, median is (median1 + median2)/2
        int lo = 0, hi = nums1.length, median1 = 0, median2 = 0;
        int len = nums1.length + nums2.length;

        while (lo <= hi) {
            // 3. par1 is number of elements we pick from nums1
            //    par2 is number of elements we pick from nums2
            //    In first half, we need len/2 elements, so we can calculate par2 by len/2 - par1
            int par1 = lo + (hi - lo) / 2;
            int par2 = len / 2 - par1;

            // 4. consider some special cases:
            int par1Left = par1 > 0 ? nums1[par1 - 1] : Integer.MIN_VALUE;
            int par1Right = par1 + 1 <= nums1.length ? nums1[par1] : Integer.MAX_VALUE;
            int par2Left = par2 > 0 ? nums2[par2 - 1] : Integer.MIN_VALUE;
            int par2Right = par2 + 1 <= nums2.length ? nums2[par2] : Integer.MAX_VALUE;

            // 5. if par1Left is the greatest number that makes par1Left < par2Right
            //    then par1Right must greater than par2Left
            if (par1Left <= par2Right) {
                median1 = Math.max(par1Left, par2Left);
                median2 = Math.min(par1Right, par2Right);
                lo = par1 + 1;
            } else {
                hi = par1 - 1;
            }
        }


        return len % 2 == 0 ? (median1 + median2) / 2.0 : median2;

    }
}

/*

Time complexity: O(m+n)
Space complexity: O(1)
class Solution0004 {
    public double findMedianSortedArrays2(int[] nums1, int[] nums2) {
        int i = 0, j = 0, median1 = 0, median2 = 0;
        int len = nums1.length + nums2.length;

        // 1. if an array has k elements:
        // - if k is odd, median is the (k / 2 + 1)th element
        // - if k is even, median is the (k / 2)th element plus (k / 2 + 1)th element
        // in both cases, we need to go through two arrays to (k / 2 + 1)th element
        for (int count = 0; count <= len / 2; count++) {
            // 2. median1 store the previous value of median2
            //    when median2 = (k / 2 + 1)th element, median1 = (k / 2)th element
            median1 = median2;
            // 3. iterate elements in both array
            if (i != nums1.length && j != nums2.length) {
                if (nums1[i] <= nums2[j]) median2 = nums1[i++];
                else median2 = nums2[j++];
            } else {
                if (i != nums1.length) median2 = nums1[i++];
                if (j != nums2.length) median2 = nums2[j++];
            }
        }
        return len % 2 == 0 ? (median1 + median2) / 2.0 : median2;
    }
}
*/


public class _0004_MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3};
        int[] arr2 = {2};
        Solution0004 slt = new Solution0004();
        double res = slt.findMedianSortedArrays(arr1, arr2);
        System.out.println(res);

    }
}
