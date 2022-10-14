package leetcode_binary_search;


import java.util.PriorityQueue;

class Solution1337 {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] res = new int[k];
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
        int rowPos = 0;

        // for every row, find the first pos of 0
        for (int[] row : mat) {
            int lo = 0, hi = row.length;
            while (lo < hi) {
                int mid = lo + (hi - lo) / 2;
                if (row[mid] == 0) hi = mid;
                else lo = mid + 1;
            }
            queue.add(new int[]{lo, rowPos++});
        }

        for (int i = 0; i < k; i++) res[i] = queue.poll()[1];

        return res;
    }

}

public class _1337_TheKWeakestRowsMatrix {
    public static void main(String[] args) {
        int[][] mat = {
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 0},
                {1, 0, 0, 0, 0},
                {1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1}
        };
        int k = 3;
        Solution1337 slt = new Solution1337();
        int[] res = slt.kWeakestRows(mat, k);

        for (int i : res) System.out.print(i + " ");

    }
}
