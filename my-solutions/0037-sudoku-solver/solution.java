class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public void solve(char[][] board) {
        solver(board, 0, 0);
    }

    public boolean solver(char[][] mat, int r, int c) {
        //base case
        if (r == 8 && c == 9) {
            return true;
        }

        //column ends, move to the next row
        if (c == 9) {
            r++;
            c = 0;
        }

        //if cell is filled, move to next
        if (mat[r][c] != '.') {
            return solver(mat, r, c + 1);
        }

        for (char n = '1'; n <= '9'; n++) {
            if (isSafe(mat, r, c, n)) {
                mat[r][c] = n;
                if (solver(mat, r, c + 1)) {
                    return true;
                }
                mat[r][c] = '.';
            }
        }
        return false;
    }

    public boolean isSafe(char[][] mat, int r, int c, char n) {
        for (int i = 0; i < 9; i++) {
            if (mat[r][i] == n) {
                return false;
            }
        }
        for (int i = 0; i < 9; i++) {
            if (mat[i][c] == n) {
                return false;
            }
        }
        int startR = r - (r % 3);
        int startC = c - (c % 3);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i + startR][j + startC] == n) {
                    return false;
                }
            }
        }
        return true;
    }
}
