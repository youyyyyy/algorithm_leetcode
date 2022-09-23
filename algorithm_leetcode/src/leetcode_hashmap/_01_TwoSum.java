package leetcode_hashmap;

import java.util.HashMap;

// Time complexity: O(N)
// Space complexity: O(N)
class Solution01 {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();

        //    A number is looking for its pair in the map
        //    If not found, put itself and its index in the map
        //    If found, return the index in the map, and its index
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (!map.containsKey(temp)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(temp), i};
            }
        }

        return null;
    }

    // brute force
/*    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }*/
}

public class _01_TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        Solution01 slt = new Solution01();
        int[] res = slt.twoSum(arr, target);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
