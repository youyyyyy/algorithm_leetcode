package leetcode_array;


/*
Time complexity: O(m * n)
Space complexity: O(1)
*/

class Solution0766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i >= 1 && j >= 1 && matrix[i][j] != matrix[i - 1][j - 1]) return false;
            }
        }

        return true;
    }
}

public class _0766_ToeplitzMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4}, {5, 1, 2, 3}, {9, 5, 1, 2}};
        Solution0766 slt = new Solution0766();
        boolean res = slt.isToeplitzMatrix(matrix);
        System.out.println(res);
    }
}
