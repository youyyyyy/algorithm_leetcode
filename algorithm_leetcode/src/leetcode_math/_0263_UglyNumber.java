package leetcode_math;

class Solution0263 {
    public boolean isUgly(int n) {
        if (n == 0) return false;

        while (n % 2 == 0) n /= 2;
        while (n % 3 == 0) n /= 3;
        while (n % 5 == 0) n /= 5;

        return n == 1;
    }
}

public class _0263_UglyNumber {
    public static void main(String[] args) {
        int n = 6;
        Solution0263 slt = new Solution0263();
        boolean res = slt.isUgly(n);
        System.out.println(res);
    }
}
