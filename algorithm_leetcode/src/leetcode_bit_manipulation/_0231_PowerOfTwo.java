package leetcode_bit_manipulation;

/*
 * Power of two ===> only one bit is 1
 *
 * - Solution 1: x & (-x) ===> keep the rightmost 1-bit and set all the other bits to 0
 *   - Proof: x = 4 ===> x = 0000 0100
 *            -x = ~x + 1 = 1111 1100
 *            x & (-x) = 0000 0100
 *            check if x == (x & (-x))
 *
 * - Solution 2: x & (x - 1) ===> turn off the rightmost 1-bit
 *   - Proof: x = 4 ===> x = 0000 0100
 *            x - 1 ===> x = 0000 0010
 *            x & (x - 1) = 0000 0000
 *            check if x & (x - 1) == 0
 *
 * */

// Time complexity: O(1)
// Space complexity: O(1)
class Solution0231 {
    public boolean isPowerOfTwo(int n) {
        // Solution 1:
        // return n > 0 && (n & (-n)) == n;

        // Solution 2:
        return n > 0 && (n & (n - 1)) == 0;

    }
}

public class _0231_PowerOfTwo {
    public static void main(String[] args) {
        Solution0231 slt = new Solution0231();
        System.out.println(slt.isPowerOfTwo(1));  // true
        System.out.println(slt.isPowerOfTwo(16));  // true
        System.out.println(slt.isPowerOfTwo(3));  // false
        System.out.println(slt.isPowerOfTwo(Integer.MAX_VALUE));  // false
        System.out.println(slt.isPowerOfTwo(Integer.MIN_VALUE));  // false
    }
}
