package leetcode_sliding_window;

/*
 * Time complexity: O(n^2)
 * Space complexity: O(n^2)
 * */

class Solution0005 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len == 1) return s;

        int start = 0, end = 0, maxLen = 1;

        boolean[][] dp = new boolean[len][len];

        // 1. first fill out the single character, single character is always palindrome
        for (int i = 0; i < len; i++) dp[i][i] = true;

        for (int right = 1; right < len; right++) {
            for (int left = 0; left < right; left++) {
                // 2. if palindrome is longer than 2, e.g. 'aaba', 'ab' is not palindrome, return false
                if (s.charAt(left) == s.charAt(right) && ((right - left < 2) || dp[left + 1][right - 1]))
                    dp[left][right] = true;

                if (dp[left][right] && right - left + 1 > maxLen) {
                    start = left;
                    end = right;
                    maxLen = end - start + 1;
                }
            }
        }

        return s.substring(start, end + 1);
    }
}

public class _0005_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution0005 slt = new Solution0005();
        String s = "bababcc";
        String res = slt.longestPalindrome(s);
        System.out.println(res);

    }
}
