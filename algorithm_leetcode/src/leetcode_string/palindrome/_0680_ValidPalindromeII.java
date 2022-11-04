package leetcode_string.palindrome;

class Solution0680 {
    public boolean validPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return isPalindrome(s, left + 1, right) || isPalindrome(s, left, right - 1);
            }

            left++;
            right--;
        }

        return true;
    }

    private boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) return false;
            left++;
            right--;
        }

        return true;
    }
}

public class _0680_ValidPalindromeII {
    public static void main(String[] args) {
        String s = "ebcbbececabbacecbbcbe";
        Solution0680 slt = new Solution0680();
        boolean res = slt.validPalindrome(s);
        System.out.println(res);
    }
}
