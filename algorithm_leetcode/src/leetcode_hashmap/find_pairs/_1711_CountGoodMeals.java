package leetcode_hashmap.find_pairs;

import java.util.HashMap;


// Time complexity: O(N * logC) - N is the length of deliciousness, C is the (max value of deliciousness[i] * 2)
// Space complexity: O(N)
class Solution1711 {
    public int countPairs(int[] deliciousness) {
        final int mod = 1_000_000_007;

        // 1. put num one by one to prevent duplicates pairs
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : deliciousness) {
            // 2. 0 <= deliciousness[i] <= 2^20  ===> sum <= 2^21
            for (int i = 0; i <= 21; i++) {
                int target = (int) Math.pow(2, i);
                if (map.containsKey(target - num)) {
                    res += map.get(target - num);
                    // 3. res is always in the range of Integer
                    res %= mod;
                }
            }
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        return res;

    }
}

public class _1711_CountGoodMeals {
    public static void main(String[] args) {
        Solution1711 slt = new Solution1711();
        System.out.println(slt.countPairs(new int[]{1, 3, 5, 7, 9})); // 4
        System.out.println(slt.countPairs(new int[]{1, 1, 1, 3, 3, 3, 7}));  // 15
        System.out.println(slt.countPairs(new int[]{149, 107, 1, 63, 0, 1, 6867, 1325, 5611, 2581, 39, 89, 46, 18, 12, 20, 22, 234}));  // 12
    }
}
