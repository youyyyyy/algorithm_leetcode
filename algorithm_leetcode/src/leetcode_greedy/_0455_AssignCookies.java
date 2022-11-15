package leetcode_greedy;

import java.util.Arrays;

class Solution0455 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int res = 0;
        int i = g.length - 1, j = s.length - 1;

        for (; i >= 0 && j >= 0; i--) {
            if (s[j] >= g[i]) {
                res++;
                j--;
            }
        }

        return res;
    }
}

public class _0455_AssignCookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        Solution0455 slt = new Solution0455();
        int res = slt.findContentChildren(g, s);
        System.out.println(res);
    }
}
