package leetcode_greedy;

import java.util.Arrays;

class Solution0452 {
    public int findMinArrowShots(int[][] points) {
        // 1. handle overflow
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));

        // 2. if start <= currentEnd, we can burst these balloons in one arrow
        int res = 1;
        int currentEnd = points[0][1];
        for (int[] point : points) {
            int start = point[0];
            int end = point[1];
            if (start > currentEnd) {
                currentEnd = end;
                res++;
            }
        }

        return res;
    }
}

public class _0452_MinimumNumberArrowsBurstBalloons {
    public static void main(String[] args) {
        Solution0452 slt = new Solution0452();
        System.out.println(slt.findMinArrowShots(new int[][]{{10, 16}, {2, 8}, {1, 6}, {7, 12}}));  // 2
        System.out.println(slt.findMinArrowShots(new int[][]{{1, 2}, {3, 4}, {5, 6}, {7, 8}}));  // 4
        System.out.println(slt.findMinArrowShots(new int[][]{{1, 2}, {2, 3}, {3, 4}, {4, 5}}));  // 2
    }
}
