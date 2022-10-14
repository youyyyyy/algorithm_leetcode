package leetcode_union_find;

class Solution130 {
    class UF {
        int[] parent;
        int[] rank;

        public UF(char[][] board, int row, int col) {
            parent = new int[row * col + 1];
            rank = new int[row * col + 1];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (board[i][j] == 'O') {
                        parent[i * col + j] = i * col + j;
                    }
                }
            }
            parent[row * col] = row * col;
        }

        public int find(int p) {
            while (p != parent[p]) {
                parent[p] = parent[parent[p]];
                p = parent[p];
            }
            return p;
        }

        public void union(int p, int q) {
            int rootP = find(p);
            int rootQ = find(q);
            if (rootP == rootQ) return;

            // make root of smaller rank point to root of larger rank
            if (rank[rootP] < rank[rootQ]) parent[rootP] = rootQ;
            else if (rank[rootP] > rank[rootQ]) parent[rootQ] = rootP;
            else {
                parent[rootQ] = rootP;
                rank[rootP]++;
            }
        }

        public boolean connected(int p, int q) {
            return find(p) == find(q);
        }
    }

    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int row = board.length;
        int col = board[0].length;
        if (row == 2 || col == 2) return;

        UF uf = new UF(board, row, col);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == 'O') {
                    if (i == 0 || j == 0 || i == row - 1 || j == col - 1) {
                        uf.union(i * col + j, row * col);
                    } else {
                        int index = i * col + j;
                        // check if the grid above is 'O'
                        if (i - 1 >= 0 && board[i - 1][j] == 'O') uf.union(index, index - col);
                        // check if the left grid is 'O'
                        if (j - 1 >= 0 && board[i][j - 1] == 'O') uf.union(index, index - 1);
                        // check if the grid below is 'O'
                        if (i + 1 < row && board[i + 1][j] == 'O') uf.union(index, index + col);
                        // check if the right grid is 'O'
                        if (j + 1 < col && board[i][j + 1] == 'O') uf.union(index, index + 1);

                    }
                }
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (!uf.connected(row * col, i * col + j)) {
                    board[i][j] = 'X';
                }
            }
        }

    }
}

public class _130_SurroundedRegions {
    public static void main(String[] args) {
        char[][] board = {{'O', 'O', 'O'}, {'O', 'O', 'O'}, {'O', 'O', 'O'}};
        Solution130 slt = new Solution130();
        slt.solve(board);
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
