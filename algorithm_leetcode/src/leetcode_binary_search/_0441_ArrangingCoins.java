package leetcode_binary_search;

class Solution0441 {
    public int arrangeCoins(int n) {
        long lo = 0, hi = n;
        while (lo <= hi) {
            long mid = lo + (hi - lo) / 2;
            long temp = mid * (mid + 1) / 2;
            if (temp == n) return (int)mid;
            else if (temp > n) hi = mid - 1;
            else lo = mid + 1;
        }

        return (int)hi;

    }
}

public class _0441_ArrangingCoins {
    public static void main(String[] args) {
        int n = 8;
        Solution0441 slt = new Solution0441();
        int res = slt.arrangeCoins(n);
        System.out.println(res);
    }
}
