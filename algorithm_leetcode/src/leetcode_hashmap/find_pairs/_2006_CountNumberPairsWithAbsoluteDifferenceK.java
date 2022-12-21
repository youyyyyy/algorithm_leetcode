package leetcode_hashmap.find_pairs;

import java.util.HashMap;


// Time complexity: O(n)
// Space complexity: O(n)
class Solution2006 {
    public int countKDifference(int[] nums, int k) {
        int res = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num + k)) res += map.get(num + k);
            if (map.containsKey(num - k)) res += map.get(num - k);
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return res;
    }
}

public class _2006_CountNumberPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        Solution2006 slt = new Solution2006();
        System.out.println(slt.countKDifference(new int[]{1, 2, 2, 1}, 1));  // 4
        System.out.println(slt.countKDifference(new int[]{1, 3}, 3));  // 0
        System.out.println(slt.countKDifference(new int[]{3, 2, 1, 5, 4}, 2));  // 3
    }

}
