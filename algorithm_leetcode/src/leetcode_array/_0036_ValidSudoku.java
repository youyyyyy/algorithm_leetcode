package leetcode_array;

class Solution0036 {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9];
        int[][] cols = new int[9][9];
        int[][] boxes = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] != '.') {
                    int loc = board[i][j] - '1';
                    if (++rows[i][loc] > 1) return false;
                    if (++cols[j][loc] > 1) return false;
                    if (++boxes[i / 3 * 3 + j / 3][loc] > 1) return false;
                }
            }
        }

        return true;

    }
}

public class _0036_ValidSudoku {
    public static void main(String[] args) {
        char[][] arr = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '7', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        Solution0036 slt = new Solution0036();
        boolean res = slt.isValidSudoku(arr);
        System.out.println(res);

    }
}
