package leetcode_bit_manipulation;

/*
Time complexity: O(max(M,N))
Space complexity: O(max(M,N))
*/

class Solution0067 {
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int len = Math.max(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            int val1 = i > a.length() - 1 ? 0 : a.charAt(a.length() - 1 - i) - '0';
            int val2 = i > b.length() - 1 ? 0 : b.charAt(b.length() - 1 - i) - '0';
            int sum = val1 + val2 + carry;
            sb.append(sum % 2);
            carry = sum / 2;
        }
        if (carry == 1) sb.append('1');

        return sb.reverse().toString();
    }
}

/*
Solution 2: built-in methods

import java.math.BigInteger;

class Solution0067 {
    public String addBinary(String a, String b) {

        // BigInteger(String val, int radix) - Translates the String representation of a BigInteger in the specified radix into a BigInteger.
        BigInteger bigA = new BigInteger(a, 2);
        BigInteger bigB = new BigInteger(b, 2);

        // add(BigInteger val) - Returns a BigInteger whose value is (this + val).
        // toString(int radix) - Returns the String representation of this BigInteger in the given radix.
        return bigA.add(bigB).toString(2);
    }
}
*/


public class _0067_AddBinary {
    public static void main(String[] args) {
        Solution0067 slt = new Solution0067();
        System.out.println(slt.addBinary("11", "1"));
        System.out.println(slt.addBinary("1010", "1011"));
    }
}
