package leetcode_union_find;

class Solution200 {
    class UF {
        int[] parent;
        int[] rank;
        int count;  // the number of islands

        public UF(char[][] grid, int row, int col) {
            int size = row * col;
            count = 0;
            parent = new int[size];
            rank = new int[size];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (grid[i][j] == '1') {
                        parent[i * col + j] = i * col + j;
                        count++;
                    }
                }
            }
        }

        public int count() {
            return count;
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
            count--;
        }


    }


    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0) return 0;

        int row = grid.length;
        int col = grid[0].length;
        UF uf = new UF(grid, row, col);
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == '1') {
                    int index = i * col + j;
                    // check if the grid above is 1
                    if (i - 1 >= 0 && grid[i - 1][j] == '1') uf.union(index, index - col);
                    // check if the left grid is 1
                    if (j - 1 >= 0 && grid[i][j - 1] == '1') uf.union(index, index - 1);
                    // check if the grid below is 1
                    if (i + 1 < row && grid[i + 1][j] == '1') uf.union(index, index + col);
                    // check if the right grid is 1
                    if (j + 1 < col && grid[i][j + 1] == '1') uf.union(index, index + 1);
                }
            }
        }
        return uf.count;
    }
}

public class _200_NumberIslands {
    public static void main(String[] args) {

    }
}
