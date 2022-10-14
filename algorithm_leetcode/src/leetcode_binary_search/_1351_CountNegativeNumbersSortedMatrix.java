package leetcode_binary_search;

class Solution1351 {
    public int countNegatives(int[][] grid) {
        int res = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            int temp = grid[row][col];
            if (temp < 0) {
                res += rows - row;
                col--;
            } else {
                row++;
            }
        }

        return res;
    }
}

public class _1351_CountNegativeNumbersSortedMatrix {
    public static void main(String[] args) {
        int[][] grid = {{4, 3, 2, -1}, {3, 2, 1, -1}, {1, 1, -1, -2}, {-1, -1, -2, -3}};
        Solution1351 slt = new Solution1351();
        int res = slt.countNegatives(grid);
        System.out.println(res);
    }
}
