package leetcode_bit_manipulation;


// Time complexity: O(1)
// Space complexity: O(1)
class Solution0190 {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }

        return rev;
    }
}

public class _0190_ReverseBits {
    public static void main(String[] args) {
        Solution0190 slt = new Solution0190();
        System.out.println(slt.reverseBits(0b00000010100101000001111010011100));  // 964176192
        System.out.println(slt.reverseBits(0b11111111111111111111111111111101));  // -1073741825
    }
}
