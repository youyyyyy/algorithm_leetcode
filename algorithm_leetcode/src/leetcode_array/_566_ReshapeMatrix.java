package leetcode_array;

class Solution566 {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) return mat;

        int[][] res = new int[r][c];
        for (int i = 0; i < r * c; i++) {
            res[i / c][i % c] = mat[i / n][i % n];
        }
        return res;
    }
}

public class _566_ReshapeMatrix {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3, 4}, {5, 6, 7, 8}};
        int r = 8, c = 1;
        Solution566 slt = new Solution566();
        int[][] res = slt.matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
