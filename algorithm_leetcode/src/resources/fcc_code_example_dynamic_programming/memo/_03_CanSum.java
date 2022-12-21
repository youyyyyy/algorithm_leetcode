/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 *
 * Description:
 * - takes in a targetSum and an array of numbers as arguments
 * - return a boolean indicating whether it is possible to generate the targetSum using numbers from the array
 * - you may use an element of the array as many times as needed
 * - you may assume that all input numbers are non-negative
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.HashMap;

// Time complexity: O(m*n)
// Space complexity: O(m)
class Solution03 {
    public boolean canSum(int target, int[] nums) {
        HashMap<Integer, Boolean> map = new HashMap<>();
        return helper(target, nums, map);
    }

    private boolean helper(int target, int[] nums, HashMap<Integer, Boolean> map) {
        if (map.containsKey(target)) return map.get(target);
        if (target == 0) return true;
        if (target < 0) return false;

        for (int num : nums) {
            int remainder = target - num;
            if (helper(remainder, nums, map)) {
                map.put(target, true);
                return true;
            }
        }
        map.put(target, false);
        return false;
    }
}

public class _03_CanSum {
    public static void main(String[] args) {
        // test cases
        Solution03 slt = new Solution03();
        System.out.println(slt.canSum(7, new int[]{2, 3}));  // true
        System.out.println(slt.canSum(7, new int[]{5, 3, 4, 7}));  // true
        System.out.println(slt.canSum(7, new int[]{2, 4}));  // false
        System.out.println(slt.canSum(8, new int[]{2, 3, 5}));  // true
        System.out.println(slt.canSum(300, new int[]{7, 14}));  // false
    }
}
