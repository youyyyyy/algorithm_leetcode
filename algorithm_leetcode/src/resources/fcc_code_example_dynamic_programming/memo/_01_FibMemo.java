/*
 * JS example from Coderbyte & freeCodeCamp.org
 * url = https://www.youtube.com/watch?v=oBt53YbR9Kk&t=12953s
 * leetcode = https://leetcode.com/problems/fibonacci-number/
 * */

package resources.fcc_code_example_dynamic_programming.memo;

import java.util.HashMap;

// Time complexity: O(n)
// Space complexity: O(n)
class Solution01 {
    public int fib(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        return helper(n, memo);
    }

    private int helper(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        if (n <= 2) return 1;

        memo.put(n, helper(n - 1, memo) + helper(n - 2, memo));
        return memo.get(n);
    }
}


public class _01_FibMemo {
    public static void main(String[] args) {
        // test cases
        Solution01 slt = new Solution01();
        System.out.println(slt.fib(6));  // 8
        System.out.println(slt.fib(7));  // 13
        System.out.println(slt.fib(8));  // 21
        System.out.println(slt.fib(30));  // 832040
    }
}

