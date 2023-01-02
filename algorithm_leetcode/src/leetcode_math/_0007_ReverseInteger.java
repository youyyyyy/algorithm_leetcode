package leetcode_math;

class Solution0007 {
    public int reverse(int x) {
        if (x > -10 && x < 10) return x;

        int sum = 0;
        while (x != 0) {
            // when check whether to add digit to 214748364, we don't need to check if the digit <= 7
            // because parameter x < 2^31 - 1, the last digit must <= 2
            if (sum < Integer.MIN_VALUE / 10 || sum > Integer.MAX_VALUE / 10) return 0;
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        return sum;
    }
}

public class _0007_ReverseInteger {
    public static void main(String[] args) {
        Solution0007 slt = new Solution0007();
        System.out.println(slt.reverse(123));
        System.out.println(slt.reverse(-123));
        System.out.println(slt.reverse(120));
        System.out.println(slt.reverse(1534236469));
        System.out.println(slt.reverse(Integer.MIN_VALUE));
        System.out.println(slt.reverse(Integer.MAX_VALUE));
    }
}
