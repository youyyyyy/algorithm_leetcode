package leetcode_string;

/*
 * Time complexity : O(max(m,n))
 * Space complexity : O(max(m,n))
 * */
class Solution0415 {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int len1 = num1.length(), len2 = num2.length();
        int carry = 0;
        for (int i = len1 - 1, j = len2 - 1; i >= 0 || j >= 0; i--, j--) {
            int val1 = i >= 0 ? num1.charAt(i) - '0' : 0;
            int val2 = j >= 0 ? num2.charAt(j) - '0' : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            sb.append(sum % 10);
        }

        if (carry == 1) sb.append(1);
        return sb.reverse().toString();
    }
}

public class _0415_AddStrings {
    public static void main(String[] args) {
        String num1 = "99";
        String num2 = "123";

        Solution0415 slt = new Solution0415();
        String res = slt.addStrings(num1, num2);
        System.out.println(res);
    }
}
