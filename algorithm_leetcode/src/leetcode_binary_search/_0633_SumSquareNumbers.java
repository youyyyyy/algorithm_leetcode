package leetcode_binary_search;

class Solution0633 {
    public boolean judgeSquareSum(int c) {

        int left = 0, right = (int) Math.sqrt(c);
        while (left <= right) {
            int temp1 = left * left;
            int temp2 = right * right;
            if (temp1 == c - temp2) return true;
            else if (temp1 < c - temp2) left++;
            else right--;
        }

        return false;

    }
}

public class _0633_SumSquareNumbers {
    public static void main(String[] args) {
        int c = 2147483600;
        Solution0633 slt = new Solution0633();
        boolean res = slt.judgeSquareSum(c);
        System.out.println(res);
    }
}
