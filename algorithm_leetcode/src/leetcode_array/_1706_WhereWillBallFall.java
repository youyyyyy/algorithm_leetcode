package leetcode_array;

class Solution1706 {
    public int[] findBall(int[][] grid) {

        int len = grid[0].length;
        int[] res = new int[len];

        for (int i = 0; i < len; i++) { // col of each drop
            int col = i;
            for (int[] row : grid) {
                int cur = row[col];

                // move the ball
                // if val = 1, col move to right, if val = -1, col move to left
                col += cur;
                if (col < 0 || col == len || row[col] != cur) {
                    col = -1;
                    break;
                }
            }

            res[i] = col;
        }

        return res;

    }
}

public class _1706_WhereWillBallFall {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, -1, -1}, {1, 1, 1, -1, -1}, {-1, -1, -1, 1, 1}, {1, 1, 1, 1, -1}, {-1, -1, -1, -1, -1}};
        Solution1706 slt = new Solution1706();
        int[] res = slt.findBall(grid);

        for (int i : res) System.out.print(i + " ");

    }
}
