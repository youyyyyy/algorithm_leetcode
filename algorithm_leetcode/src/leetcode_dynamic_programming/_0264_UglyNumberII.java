package leetcode_dynamic_programming;

class Solution0264 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[1690];
        dp[0] = 1;

        int factorTwo = 0, factorThree = 0, factorFive = 0;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = Math.min(dp[factorTwo] * 2, Math.min(dp[factorThree] * 3, dp[factorFive] * 5));
            if (dp[i] == dp[factorTwo] * 2) factorTwo++;
            if (dp[i] == dp[factorThree] * 3) factorThree++;
            if (dp[i] == dp[factorFive] * 5) factorFive++;
        }

        return dp[n - 1];

    }
}

public class _0264_UglyNumberII {
    public static void main(String[] args) {
        Solution0264 slt = new Solution0264();
        int n = 10;
        int res = slt.nthUglyNumber(n);
        System.out.println(res);
    }
}
