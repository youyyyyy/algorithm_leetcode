package leetcode_string.palindrome;

class Solution2396 {
    public boolean isStrictlyPalindromic(int n) {
        for (int i = 2; i <= n - 2; i++) {
            String temp = changeBase(n, i);
            System.out.println(temp);
            if (!checkPalindrome(temp)) return false;
        }

        return true;
    }

    private String changeBase(int n, int base) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            sb.insert(0, n % base);
            n /= base;
        }

        return sb.toString();
    }

    private boolean checkPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}

public class _2396_StrictlyPalindromicNumber {
    public static void main(String[] args) {
        int n = 9;
        Solution2396 slt = new Solution2396();
        boolean res = slt.isStrictlyPalindromic(n);
        System.out.println(res);
    }
}
