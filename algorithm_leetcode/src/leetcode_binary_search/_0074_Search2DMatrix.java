package leetcode_binary_search;

// Time complexity: O(log(mn)
// Space complexity: O(1)
class Solution74 {
    public boolean searchMatrix(int[][] matrix, int target) {

        int rows = matrix.length;
        int cols = matrix[0].length;

        int lo = 0;
        int hi = rows * cols - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int temp = matrix[mid / cols][mid % cols];
            if (temp == target) return true;
            else if (temp > target) hi = mid - 1;
            else lo = mid + 1;
        }

        return false;
    }
}

public class _0074_Search2DMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 15;
        Solution74 slt = new Solution74();
        boolean res = slt.searchMatrix(arr, target);
        System.out.println(res);
    }

}
