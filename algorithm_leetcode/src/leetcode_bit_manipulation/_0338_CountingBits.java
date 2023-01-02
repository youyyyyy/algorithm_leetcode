package leetcode_bit_manipulation;

import java.util.Arrays;

/*
Time complexity: O(nlogn)
Space complexity: O(1)
class Solution0338 {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 0; i < n + 1; i++) res[i] = hammingWeight(i);
        return res;
    }

    private int hammingWeight(int i) {
        int res = 0;
        while (i != 0) {
            i &= i - 1 ;
            res++;
        }

        return res;
    }
}
*/


// Time complexity: O(n)
// Space complexity: O(1)
class Solution0338 {
    public int[] countBits(int n) {
        // turn off the rightmost bit
        int[] res = new int[n + 1];
        for (int i = 1; i < n + 1; i++) {
            res[i] = res[i & (i - 1)] + 1;
        }

        return res;
    }
}

public class _0338_CountingBits {
    public static void main(String[] args) {
        Solution0338 slt = new Solution0338();
        System.out.println(Arrays.toString(slt.countBits(2)));
        System.out.println(Arrays.toString(slt.countBits(5)));
    }
}
