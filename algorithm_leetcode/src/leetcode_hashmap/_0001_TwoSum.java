package leetcode_hashmap;

import java.util.HashMap;

/*
Time complexity: O(N) - traverse nums only once
Space complexity: O(N) - hashmap can store at most nums.length elements
*/

class Solution0001 {
    public int[] twoSum(int[] nums, int target) {


        HashMap<Integer, Integer> map = new HashMap<>();

        //    A number is looking for another number so that they can add up to target
        //    If not found, put itself and its index in the map
        //    If found, return
        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (!map.containsKey(key)) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(key), i};
            }
        }

        return null;
    }
}

/*
    Brute force:
    Time complexity: O(n^2)
    Space complexity: O(1)
    public int[] twoSum2(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }*/


public class _0001_TwoSum {
    public static void main(String[] args) {
        int[] arr = {3, 3};
        int target = 6;
        Solution0001 slt = new Solution0001();
        int[] res = slt.twoSum(arr, target);

        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}
