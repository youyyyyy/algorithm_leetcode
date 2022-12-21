package leetcode_hashmap.find_pairs;

import java.util.HashMap;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution1679 {
    public int maxOperations(int[] nums, int k) {

        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int key = k - num;
            if (map.containsKey(key)) {
                res++;
                int occurrence = map.get(key);
                if (occurrence == 1) map.remove(key);
                else map.put(key, occurrence - 1);
            } else {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

        }

        return res;
    }
}

public class _1679_MaxNumberKSumPairs {
    public static void main(String[] args) {
        Solution1679 slt = new Solution1679();
        System.out.println(slt.maxOperations(new int[]{1, 2, 3, 4}, 5));  // 2
        System.out.println(slt.maxOperations(new int[]{3, 1, 3, 4, 3}, 6));  // 1
        System.out.println(slt.maxOperations(new int[]{2, 5, 4, 4, 1, 3, 4, 4, 1, 4, 4, 1, 2, 1, 2, 2, 3, 2, 4, 2}, 3)); // 4
    }
}
