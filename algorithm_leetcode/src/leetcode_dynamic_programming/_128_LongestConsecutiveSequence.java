package leetcode_dynamic_programming;

import java.util.HashSet;

class Solution128 {
    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return 1;

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : nums) {
            hashSet.add(i);
        }

        int curLen;
        int longestLen = Integer.MIN_VALUE;
        for (int i : hashSet) {
            if (!hashSet.contains(i - 1)) {
                curLen = 1;
                while (hashSet.contains(++i)) curLen++;
                longestLen = Math.max(curLen, longestLen);
            }
        }
        return longestLen;
    }
}

public class _128_LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        Solution128 slt = new Solution128();
        int res = slt.longestConsecutive(arr);
        System.out.println(res);

    }
}
