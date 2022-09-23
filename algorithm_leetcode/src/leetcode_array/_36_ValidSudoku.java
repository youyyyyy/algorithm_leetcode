package leetcode_array;

class Solution36 {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][][] small = new int[3][3][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char c = board[i][j];
                if (c != '.') {
                    int index = c - '0' - 1;
                    row[i][index]++;
                    col[j][index]++;
                    small[i / 3][j / 3][index]++;
                    if (row[i][index] > 1 || col[j][index] > 1 || small[i / 3][j / 3][index] > 1) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
}

public class _36_ValidSudoku {
    public static void main(String[] args) {
        char[][] arr = {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '7' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};
        Solution36 slt = new Solution36();
        boolean res = slt.isValidSudoku(arr);
        System.out.println(res);

    }
}
