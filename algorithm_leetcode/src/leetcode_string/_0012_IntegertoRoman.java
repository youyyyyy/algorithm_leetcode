package leetcode_string;


class Solution0012 {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (values[i] <= num) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}

public class _0012_IntegertoRoman {
    public static void main(String[] args) {
        int num = 3;
        Solution0012 slt = new Solution0012();
        String res = slt.intToRoman(num);
        System.out.println(res);
    }
}
