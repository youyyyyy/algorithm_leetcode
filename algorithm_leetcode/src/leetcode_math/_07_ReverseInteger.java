package leetcode_math;

class Solution07 {
    public int reverse(int x) {
        if (x > -10 && x < 10) return x;

        int sum = 0;
        while (x != 0) {
            if (sum < Integer.MIN_VALUE / 10 || sum > Integer.MAX_VALUE / 10) return 0 ;
            sum = sum * 10 + x % 10;
            x = x / 10;
        }
        return sum;
    }
}

public class _07_ReverseInteger {
    public static void main(String[] args) {
        Solution07 slt = new Solution07();
        int n = 1534236469;
        int res = slt.reverse(n);
        System.out.println(res);
    }
}
