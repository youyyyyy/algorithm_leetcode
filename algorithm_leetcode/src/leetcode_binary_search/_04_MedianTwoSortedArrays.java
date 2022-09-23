package leetcode_binary_search;

class Solution04 {
    // TODO: binary search
    // The overall run time complexity should be O(log (m+n))
/*    public double findMedianSortedArrays1(int[] nums1, int[] nums2) {
        int len = nums1.length + nums2.length;

    }*/


    // Time complexity: O(m+n)
    // Space complexity: O(1)
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


public class _04_MedianTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5, 6, 9};
        int[] arr2 = {2, 4, 6};
        Solution04 slt = new Solution04();
        double res = slt.findMedianSortedArrays2(arr1, arr2);
        System.out.println(res);

    }
}
