package leetcode_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;


class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums1.length == 0 || nums2 == null || nums2.length == 0) return new int[0];
        int i = 0, j = 0;
        ArrayList<Integer> al = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                al.add(nums1[i]);
                i++;
                j++;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] res = new int[al.size()];
        for (i = 0; i < res.length; i++) {
            res[i] = al.get(i);
        }
        return res;
    }

}



public class _350_IntersectionTwoArraysII {
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
