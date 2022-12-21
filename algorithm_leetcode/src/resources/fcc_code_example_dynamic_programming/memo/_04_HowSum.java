/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 *
 * Description:
 * - takes in a targetSum and an array of numbers as arguments
 * - return an array containing any combination of elements that add up to exactly the targetSum
 * - if there is no combination that adds up to the targetSum, then return null
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


// Time complexity: O(n*m^2)
// Space complexity: O(m^2)
class Solution04 {
    public List<Integer> howSum(int target, int[] nums) {
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        return helper(target, nums, map);
    }

    private List<Integer> helper(int target, int[] nums, HashMap<Integer, List<Integer>> map) {
        if (map.containsKey(target)) return map.get(target);
        if (target == 0) return new ArrayList<>();
        if (target < 0) return null;

        for (int num : nums) {
            int remainder = target - num;
            List<Integer> res = helper(remainder, nums, map);
            if (res != null) {
                res.add(num);
                map.put(target, res);
                return map.get(target);
            }
        }
        map.put(target, null);
        return null;
    }
}

public class _04_HowSum {
    public static void main(String[] args) {
        // test cases
        Solution04 slt = new Solution04();
        System.out.println(slt.howSum(7, new int[]{2, 3}));  // [3, 2, 2]
        System.out.println(slt.howSum(7, new int[]{5, 3, 4, 7}));  // [4, 3]
        System.out.println(slt.howSum(7, new int[]{2, 4}));  // null
        System.out.println(slt.howSum(8, new int[]{2, 3, 5}));  // [2, 2, 2, 2]
        System.out.println(slt.howSum(300, new int[]{7, 14}));  // null
    }
}
