package leetcode_dynamic_programming;

/*
 * Time complexity: O(n)
 * Space complexity: O(1)
 * */
class Solution1137 {
    public int tribonacci(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int prev1 = 0;
        int prev2 = 1;
        int prev3 = 1;
        int res = 0;

        for (int i = 3; i <= n; i++) {
            res = prev1 + prev2 + prev3;
            prev1 = prev2;
            prev2 = prev3;
            prev3 = res;
        }

        return res;
    }
}

/*
Bottom-up (Tabulation)
- Time complexity: O(n)
- Space complexity: O(n)
class Solution1137 {
    public int tribonacci(int n) {
        int[] dp = new int[38];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;

        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3];
        }

        return dp[n];
    }
}
*/

/*

Top-Down (Memoization):
- Time complexity: O(n)
- Space complexity: O(n)
class Solution1137 {
    HashMap<Integer, Integer> cache = new HashMap<>() {{
        put(0, 0);
        put(1, 1);
        put(2, 1);
    }};

    public int tribonacci(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        cache.put(n, tribonacci(n - 1) + tribonacci(n - 2) + tribonacci(n - 3));
        return cache.get(n);
    }
}
*/


public class _1137_NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        Solution1137 slt = new Solution1137();
        int res = slt.tribonacci(n);
        System.out.println(res);
    }
}
