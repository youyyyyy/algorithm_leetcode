package leetcode_binary_search.peak;

import java.util.Arrays;

class Solution1901 {
    public int[] findPeakGrid(int[][] mat) {

        int row = mat.length, col = mat[0].length;
        int lo = 0, hi = row - 1;
        int locOfMax = -1;

        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            locOfMax = findMax(mat, mid, col);
            if (mat[mid + 1][locOfMax] > mat[mid][locOfMax]) lo = mid + 1;
            else hi = mid;
        }

        return new int[]{lo, locOfMax};
    }

    private int findMax(int[][] mat, int curRow, int col) {
        int loc = 0;
        int max = mat[curRow][loc];

        for (int i = 0; i < col; i++) {
            if (mat[curRow][i] > max) {
                max = mat[curRow][i];
                loc = i;
            }
        }
        return loc;
    }
}

public class _1901_FindPeakElementII {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 4, 2, 1, 2, 1, 2},
                {4, 3, 6, 4, 5, 4, 3},
                {6, 2, 3, 1, 6, 7, 1},
                {4, 3, 6, 7, 18, 9, 4},
                {5, 1, 2, 5, 4, 13, 2}
        };
        Solution1901 slt = new Solution1901();
        int[] res = slt.findPeakGrid(mat);
        System.out.println(Arrays.toString(res));
    }
}
