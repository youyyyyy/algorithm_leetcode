package leetcode_two_pointers;

import java.util.ArrayList;
import java.util.List;


// Time complexity: O(m+n)
// Space complexity: O(m+n)

class Solution986 {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        if (firstList.length == 0 || secondList.length == 0) return new int[0][0];

        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0;
        while (i < firstList.length && j < secondList.length) {
            int lo = Math.max(firstList[i][0], secondList[j][0]);
            int hi = Math.min(firstList[i][1], secondList[j][1]);

            if (lo <= hi) res.add(new int[]{lo, hi});

            if (firstList[i][1] < secondList[j][1]) i++;
            else j++;
        }
        return res.toArray(new int[res.size()][]);
    }


}

public class _986_IntervalListIntersections {
    public static void main(String[] args) {
        int[][] firstList = {{1, 2}, {5, 10}, {13, 23}, {24, 25}};
        int[][] secondList = {{1, 5}, {8, 12}, {15, 24}, {25, 26}};
        Solution986 slt = new Solution986();
        int[][] res = slt.intervalIntersection(firstList, secondList);

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[i].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
