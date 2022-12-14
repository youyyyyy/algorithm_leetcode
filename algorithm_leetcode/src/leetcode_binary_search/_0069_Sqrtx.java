package leetcode_binary_search;


/*
* Time complexity: O(logN)
* Space complexity: O(1)
* */

class Solution0069 {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) return x;

        int lo = 1, hi = x;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (mid == x / mid) {
                return mid;
            } else if (mid < x / mid) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return hi;
    }
}

public class _0069_Sqrtx {
    public static void main(String[] args) {
        int x = 8;
        Solution0069 slt = new Solution0069();
        int res = slt.mySqrt(x);
        System.out.println(res);
    }
}
