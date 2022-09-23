package leetcode_binary_search;

// Time complexity: O(log(mn)
// Space complexity: O(1)
class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int row = matrix.length;
        int col = matrix[0].length;

        int lo = 0;
        int hi = row * col - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (matrix[mid / col][mid % col] == target) {
                return true;
            } else if (matrix[mid / col][mid % col] > target) {
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return false;
    }

    // brute force
    public boolean searchMatrix2(int[][] matrix, int target) {
        if (target < matrix[0][0] || target > matrix[matrix.length - 1][matrix[0].length - 1]) {
            return false;
        }

        for (int i = 0; i < matrix.length; i++) {
            if (target >= matrix[i][0] && target <= matrix[i][matrix[i].length - 1]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    if (target == matrix[i][j]) return true;
                }
            }
        }
        return false;
    }
}

public class _74_Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 15;
        Solution74 slt = new Solution74();
        boolean res = slt.searchMatrix(arr, target);
        System.out.println(res);
    }

}
