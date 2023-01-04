package leetcode_array;

import java.util.HashMap;

/*
 * Sequence doesn't matter, occurrence matters.
 * When count > 1, count can be represented by 3x + 2y
 * - (1) if count % 3 == 0, add count / 3 to res
 * - (2) if count % 3 == 1, count = (count / 3 - 1) * 3 + 2 * 2 e.g, 10 = 2 * 3 + 2 * 2
 * - (3) if count % 3 == 2, count = (count / 3) * 3 + 2  e.g. 8 = 2 * 3 + 2
 * combine (2) and (3), add count / 3 + 1 to res
 * */

// Time complexity: O(n)
// Space complexity: O(n)
class Solution2244 {
    public int minimumRounds(int[] tasks) {
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int task : tasks) map.put(task, map.getOrDefault(task, 0) + 1);
        for (int value : map.values()) {
            if (value == 1) return -1;
            if (value % 3 == 0) res += value / 3;
            else res += value / 3 + 1;
        }

        return res;
    }
}

public class _2244_MinimumRoundsCompleteAllTasks {
    public static void main(String[] args) {
        Solution2244 slt = new Solution2244();
        System.out.println(slt.minimumRounds(new int[]{2, 2, 3, 3, 2, 4, 4, 4, 4, 4}));  // 4
        System.out.println(slt.minimumRounds(new int[]{2, 3, 3}));  // -1
    }
}
