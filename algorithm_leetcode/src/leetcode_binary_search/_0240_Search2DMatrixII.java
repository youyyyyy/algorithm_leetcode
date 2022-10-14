package leetcode_binary_search;


/*
* Time complexity: O(m+n)
* Space complexity: O(1)
* */
class Solution0240 {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0, col = cols - 1;
        while (row < rows && col >= 0) {
            int temp = matrix[row][col];
            if (temp == target) return true;
            else if (temp > target) col--;
            else row++;
        }

        return false;
    }
}

public class _0240_Search2DMatrixII {
    public static void main(String[] args) {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        int target = 5;
        Solution0240 slt = new Solution0240();
        boolean res = slt.searchMatrix(matrix, target);
        System.out.println(res);
    }
}
