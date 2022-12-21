package leetcode_hashmap.find_pairs;

import java.util.HashMap;


// Time complexity: O(n)
// Space complexity: O(n)
class Solution2399 {
    public boolean checkDistances(String s, int[] distance) {
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            if (map.containsKey(key)) {
                if (distance[key - 'a'] != i - map.get(key) - 1) return false;
            } else {
                map.put(key, i);
            }
        }

        return true;
    }
}

public class _2399_CheckDistancesBetweenSameLetters {
    public static void main(String[] args) {
        Solution2399 slt = new Solution2399();
        System.out.println(slt.checkDistances(
                "abaccb", new int[]{1, 3, 0, 5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0})); // true
        System.out.println(slt.checkDistances(
                "aa", new int[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));  // false
    }
}
