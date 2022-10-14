package leetcode_two_pointers;

import java.util.Arrays;


class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int[] res = new int[Math.min(nums1.length, nums2.length)];
        int i = 0, j = 0, k = 0;
        while (i < nums1.length && j < nums2.length) {
            int num1 = nums1[i];
            int num2 = nums2[j];
            if (num1 == num2) {
                res[k++] = nums1[i];
                i++;
                j++;
            } else if (num1 < num2) {
                i++;
            } else {
                j++;
            }
        }

        return Arrays.copyOfRange(res, 0, k);
    }

}


public class _0350_IntersectionTwoArraysII {
    public static void main(String[] args) {
        int[] arr1 = {4, 9, 5};
        int[] arr2 = {9, 4, 9, 8, 4};
        Solution350 slt = new Solution350();
        int[] res = slt.intersect(arr1, arr2);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
