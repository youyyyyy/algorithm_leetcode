package leetcode_dynamic_programming;


class Solution63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if (row == 1 && col == 1) return 1 - obstacleGrid[0][0];

        int[][] dp = new int[row][col];

        // if the start grid or end grid is an obstacle, return 0
        if (obstacleGrid[0][0] == 1 || obstacleGrid[row - 1][col - 1] == 1) return 0;
        dp[0][0] = 1;

        // fill the first row
        for (int i = 1; i < col; i++) {
            if (obstacleGrid[0][i] == 1 || dp[0][i - 1] == 0) dp[0][i] = 0;
            else dp[0][i] = 1;
        }

        // fill the first column
        for (int i = 1; i < row; i++) {
            if (obstacleGrid[i][0] == 1 || dp[i - 1][0] == 0) dp[i][0] = 0;
            else dp[i][0] = 1;
        }

        // fill the dp grid
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (obstacleGrid[i][j] == 1) dp[i][j] = 0;
                else dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[row - 1][col - 1];

    }

}

public class _63_UniquePathsII {
    public static void main(String[] args) {
        Solution63 slt = new Solution63();
        int[][] obstacleGrid = {{0, 1, 0, 0, 0}, {1, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        int res = slt.uniquePathsWithObstacles(obstacleGrid);
        System.out.println(res);
    }
}
