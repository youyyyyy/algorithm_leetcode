/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * leetcode = https://leetcode.com/problems/unique-paths/
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.HashMap;


// Time complexity: O(m*n)
// Space complexity: O(m+n)
class Solution02 {
    public int gridTraveler(int m, int n) {
        HashMap<String, Integer> map = new HashMap<>();
        return helper(m, n, map);
    }

    private int helper(int m, int n, HashMap<String, Integer> map) {
        String key = m + "*" + n;
        if (map.containsKey(key)) return map.get(key);
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;

        map.put(key, helper(m - 1, n, map) + helper(m, n - 1, map));
        return map.get(key);
    }
}


public class _02_GridTravelerMemo {
    public static void main(String[] args) {
        // test cases
        Solution02 slt = new Solution02();
        System.out.println(slt.gridTraveler(1, 1));  // 1
        System.out.println(slt.gridTraveler(2, 3));  // 3
        System.out.println(slt.gridTraveler(3, 2));  // 3
        System.out.println(slt.gridTraveler(3, 3));  // 6
        System.out.println(slt.gridTraveler(11, 18)); // 8436285
    }
}

