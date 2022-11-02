package leetcode_greedy;

import java.util.Arrays;

class Solution0870 {
    public int[] advantageCount(int[] nums1, int[] nums2) {

        // 1. we need nums2's original index to store the value in res
        int len = nums1.length;
        int[][] nums2WithIdx = new int[len][2];
        for (int i = 0; i < len; i++) {
            nums2WithIdx[i][0] = nums2[i];
            nums2WithIdx[i][1] = i;
        }

        // 2. sort the nums2 with its corresponding index
        Arrays.sort(nums2WithIdx, (a, b) -> a[0] - b[0]);
        Arrays.sort(nums1);

        // 3. j points to the first element in sorted nums2, k points to the last element
        int[] res = new int[len];
        int j = 0, k = len - 1;

        for (int i = 0; i < len; i++) {
            int val = nums1[i];
            if (val > nums2WithIdx[j][0]) res[nums2WithIdx[j++][1]] = val;
            else res[nums2WithIdx[k--][1]] = val;
        }

        return res;
    }
}

public class _0870_AdvantageShuffle {
    public static void main(String[] args) {
        int[] nums1 = {12, 24, 8, 32};  // 8, 12, 24, 32
        int[] nums2 = {13, 25, 32, 11};  // 11, 13, 25, 32
        Solution0870 slt = new Solution0870();
        int[] res = slt.advantageCount(nums1, nums2);

        for (int i : res) System.out.print(i + " ");

    }
}
