package leetcode_dynamic_programming;

/*
 * Bottom-up (Tabulation)
 * - Time complexity: O(n)
 * - Space complexity: O(n)
 * */
class Solution0509 {
    public int fib(int n) {
        if (n == 0 || n == 1) return n;

        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }
}

/*
Top-Down (Memoization):
- Time complexity: O(n)
- Space complexity: O(n)
class Solution0509 {
    HashMap<Integer, Integer> map = new HashMap<>();

    public int fib(int n) {
        if (map.containsKey(n)) return map.get(n);
        if (n <= 1) return n;
        map.put(n, fib(n - 1) + fib(n - 2));
        return map.get(n);
    }
}
*/

/*
Optimized Bottom-up
- Time complexity: O(n)
- Space complexity: O(1)
class Solution0509 {
    public int fib(int n) {
        if (n <= 1) return n;

        int prev1 = 0;
        int prev2 = 1;
        int res = 0;
        for (int i = 2; i <= n; i++) {
            res = prev1 + prev2;
            prev1 = prev2;
            prev2 = res;
        }

        return res;
    }
}
*/

public class _0509_FibonacciNumber {
    public static void main(String[] args) {
        int n = 3;
        Solution0509 slt = new Solution0509();
        int res = slt.fib(n);
        System.out.println(res);
    }
}
