package leetcode_hashmap;

import java.util.HashMap;

/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0760 {
    public int[] anagramMappings(int[] nums1, int[] nums2) {
        int len = nums1.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) map.put(nums2[i], i);

        int[] res = new int[len];
        for (int i = 0; i < len; i++) res[i] = map.get(nums1[i]);

        return res;
    }
}

public class _0760_FindAnagramMappings {
    public static void main(String[] args) {
        int[] nums1 = {12, 28, 46, 32, 50};
        int[] nums2 = {50, 12, 32, 46, 28};
        Solution0760 slt = new Solution0760();
        int[] res = slt.anagramMappings(nums1, nums2);
        for (int i : res) System.out.print(i + " ");
    }
}
