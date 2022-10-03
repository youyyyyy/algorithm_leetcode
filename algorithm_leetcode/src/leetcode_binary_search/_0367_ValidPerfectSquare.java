package leetcode_binary_search;


/*
* Time complexity: O(logN)
* Space complexity: O(1)
* */

class Solution0367 {
    public boolean isPerfectSquare(int num) {
        int lo = 1, hi = num;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (num / (mid * 1.0) == mid) return true;
            else if (num / mid > mid) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}

public class _0367_ValidPerfectSquare {
    public static void main(String[] args) {
        Solution0367 slt = new Solution0367();
        int num = 17;
        boolean res = slt.isPerfectSquare(num);
        System.out.println(res);
    }
}
