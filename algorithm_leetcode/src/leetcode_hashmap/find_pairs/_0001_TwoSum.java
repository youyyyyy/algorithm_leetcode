package leetcode_hashmap.find_pairs;

import java.util.Arrays;
import java.util.HashMap;


// Time complexity: O(N) - traverse nums only once
// Space complexity: O(N) - hashmap can store at most nums.length elements


class Solution0001 {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int key = target - nums[i];
            if (map.containsKey(key)) return new int[]{i, map.get(key)};
            map.put(nums[i], i);
        }

        return null;
    }
}

/*
Brute force:
Time complexity: O(n^2)
Space complexity: O(1)
class Solution0001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        return null;
    }
}

*/


public class _0001_TwoSum {
    public static void main(String[] args) {
        Solution0001 slt = new Solution0001();
        System.out.println(Arrays.toString(slt.twoSum(new int[]{2, 7, 11, 15}, 9)));   // [1,0]
        System.out.println(Arrays.toString(slt.twoSum(new int[]{3, 2, 4}, 6)));  // [2, 1]
        System.out.println(Arrays.toString(slt.twoSum(new int[]{3, 3}, 6)));  // [1, 0]
    }
}
