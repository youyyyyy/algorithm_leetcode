package leetcode_string;

class Solution0409 {
    public int longestPalindrome(String s) {
        int odd = 0;

        int[] occurrence = new int[128];
        for (char ch : s.toCharArray()) occurrence[ch]++;

        // only count odd numbers, a palindrome can have at most one odd-occurrence character
        for (int i : occurrence) odd += i % 2;

        return odd == 0 ? s.length() : s.length() - odd + 1;
    }
}

public class _0409_LongestPalindrome {
    public static void main(String[] args) {
        String s = "abccccdd";
        Solution0409 slt = new Solution0409();
        int res = slt.longestPalindrome(s);
        System.out.println(res);
    }
}
