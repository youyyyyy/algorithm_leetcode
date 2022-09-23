package leetcode_math;

class Solution09 {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) return false;
        int sum = 0, org = x;
        while (x > 0) {
            sum = sum * 10 + x % 10;
            x /= 10;
        }
        return sum == org;
    }
}

public class _09_PalindromeNumber {
    public static void main(String[] args) {
        int x = 101;
        Solution09 slt = new Solution09();
        boolean res = slt.isPalindrome(x);
        System.out.println(res);
    }
}
