package leetcode_string.palindrome;

class Solution0125 {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        int left = 0, right = s.length() - 1;
        while (left < right) {
            while (left < s.length() && !Character.isLetterOrDigit(s.charAt(left))) left++;
            while (right >= 0 && !Character.isLetterOrDigit(s.charAt(right))) right--;

            if (left < right) {
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
        }

        return true;

    }
}

public class _0125_ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        Solution0125 slt = new Solution0125();
        boolean res = slt.isPalindrome(s);
        System.out.println(res);
    }
}
