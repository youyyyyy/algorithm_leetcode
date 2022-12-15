/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * https://leetcode.com/problems/coin-change/
 * */

package resources.fcc_code_example_dynamic_programming;

import java.util.HashMap;

// Time complexity: O(n*m^2)
// Space complexity: O(m^2)
class Solution05 {
    public int bestSum(int targetSum, int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        return helper(targetSum, nums, map);
    }

    private int helper(int targetSum, int[] nums, HashMap<Integer, Integer> map) {
        if (map.containsKey(targetSum)) return map.get(targetSum);
        if (targetSum == 0) return 0;
        if (targetSum < 0) return -1;

        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            int remainder = targetSum - num;
            int res = helper(remainder, nums, map);
            if (res >= 0 && res < min) min = res + 1;
        }
        map.put(targetSum, min == Integer.MAX_VALUE ? -1 : min);
        return map.get(targetSum);
    }
}

public class _05_BestSum {
    public static void main(String[] args) {
        System.out.println(new Solution05().bestSum(7, new int[]{5, 3, 4, 7}));  // 1
        System.out.println(new Solution05().bestSum(8, new int[]{2, 3, 5}));   // 2
        System.out.println(new Solution05().bestSum(8, new int[]{1, 4, 5}));   // 2
        System.out.println(new Solution05().bestSum(100, new int[]{1, 2, 5, 25}));  // 4
    }
}
