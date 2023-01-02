package leetcode_bit_manipulation;
/*
Time complexity: O(1) - 32 is constant number
Space complexity: O(1)
class Solution0191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        int mask = 1;

        for (int i = 0; i < 32; i++) {
            if ((n & mask) != 0) res++;
            mask <<= 1;
        }

        return res;
    }
}
*/

class Solution0191 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res++;
            n &= n - 1;
        }

        return res;
    }
}


public class _0191_NumberOf1Bits {
    public static void main(String[] args) {
        Solution0191 slt = new Solution0191();
        System.out.println(slt.hammingWeight(0b00000000000000000000000000001011));  // 3
        System.out.println(slt.hammingWeight(0b00000000000000000000000010000000));  // 1
        System.out.println(slt.hammingWeight(0b11111111111111111111111111111101));  // 31
    }
}
