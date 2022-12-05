package leetcode_dynamic_programming;


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0070 {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) dp[i] = dp[i - 1] + dp[i - 2];

        return dp[n];
    }
}

/*
Optimized Bottom-up:
- Time complexity: O(n)
- Space complexity: O(1)
class Solution0070 {
    public int climbStairs(int n) {
        if (n <= 2) return n;

        int res = 0;
        int prev1 = 1;
        int prev2 = 2;
        for (int i = 3; i <= n; i++) {
            res = prev1 + prev2;
            prev1 = prev2;
            prev2 = res;
        }

        return res;
    }
}
*/

/*
Top-Down (Memoization):
- Time complexity: O(n)
- Space complexity: O(n)
class Solution0070 {
    public int climbStairs(int n) {
        HashMap<Integer, Integer> memo = new HashMap<>();
        memo.put(1, 1);
        memo.put(2, 2);
        return helper(n, memo);
    }

    private int helper(int n, HashMap<Integer, Integer> memo) {
        if (memo.containsKey(n)) return memo.get(n);
        memo.put(n, helper(n - 1, memo) + helper(n - 2, memo));
        return memo.get(n);
    }
}
*/

public class _0070_ClimbingStairs {
    public static void main(String[] args) {
        Solution0070 slt = new Solution0070();
        int res = slt.climbStairs(5);
        System.out.println(res);
    }
}
