package leetcode_math;

import java.util.HashSet;

class Solution0202 {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (!set.contains(n)) {
            set.add(n);
            n = sumUp(n);
        }

        return n == 1;
    }

    private int sumUp(int num) {
        int sum = 0;
        while (num != 0) {
            int digit = num % 10;
            sum += digit * digit;
            num /= 10;
        }

        return sum;
    }
}

public class _0202_HappyNumber {
    public static void main(String[] args) {
        int n = 19;
        Solution0202 slt = new Solution0202();
        boolean res = slt.isHappy(n);
        System.out.println(res);
    }
}
