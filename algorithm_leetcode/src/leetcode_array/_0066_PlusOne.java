package leetcode_array;

import java.util.Arrays;


/*
 * Time complexity: O(n)
 * Space complexity: O(n)
 * */
class Solution0066 {
    public int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i]++;
                return digits;
            }
        }

        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}

public class _0066_PlusOne {
    public static void main(String[] args) {
        int[] digits = {9, 9, 9};
        Solution0066 slt = new Solution0066();
        int[] res = slt.plusOne(digits);
        System.out.println(Arrays.toString(res));
    }
}
