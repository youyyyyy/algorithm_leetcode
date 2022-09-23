package leetcode_string;

class Solution05 {
    public String longestPalindrome(String s) {
        if (s.length() == 1) return s;

        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {

            // 1. a palindrome could be odd or even
            int len1 = expand(s, i, i);
            int len2 = expand(s, i, i + 1);

            int maxLen = Math.max(len1, len2);

            // 2. if maxLen is greater than previous, update the pos of start and end
            if (maxLen > end - start) {
                start = i - (maxLen - 1) / 2;
                end = i + maxLen / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    // expand from the center
    private int expand(String s, int start, int end) {
        while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
            start--;
            end++;
        }
        return end - start - 1;
    }
}

public class _05_LongestPalindromicSubstring {
    public static void main(String[] args) {
        Solution05 slt = new Solution05();
        String s = "cbbd";
        String res = slt.longestPalindrome(s);
        System.out.println(res);

    }

}
