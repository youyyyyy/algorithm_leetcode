package leetcode_hashmap;


import java.util.ArrayList;
import java.util.HashMap;

class Solution350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) return intersect(nums2, nums1);

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> al = new ArrayList<>();
        for (int num : nums1) map.put(num, map.getOrDefault(num, 0) + 1);
        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                al.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] res = new int[al.size()];
        int i = 0;
        for (int num : al) res[i++] = num;

        return res;

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
