package leetcode_string;

class Solution2384 {
    public String largestPalindromic(String num) {
        int[] digits = new int[10];

        for (char ch : num.toCharArray()) digits[ch - '0']++;

        StringBuilder sb = new StringBuilder();
        for (int i = digits.length - 1; i > 0; i--) {
            int digit = digits[i];
            if (digit > 1) {
                for (int j = 0; j < digit / 2; j++) {
                    sb.append(i);
                    digits[i] = digits[i] - 2;
                }
            }

        }

        if (sb.length() != 0 && digits[0] > 1) {
            int digit = digits[0];
            for (int j = 0; j < digit / 2; j++) {
                sb.append(0);
                digits[0] = digits[0] - 2;
            }
        }

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 1) {
                sb.append(i);
                String origin = sb.toString();
                String reversed = sb.reverse().toString().substring(1);
                return origin + reversed;
            }
        }

        if (sb.length() == 0) return "0";
        String origin = sb.toString();
        String reversed = sb.reverse().toString();

        return origin + reversed;
    }
}

public class _2384_LargestPalindromicNumber {
    public static void main(String[] args) {
        String num = "0000";
        Solution2384 slt = new Solution2384();
        String res = slt.largestPalindromic(num);
        System.out.println(res);
    }
}
