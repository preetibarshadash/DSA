class Solution {
    public int totalNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        for (int i = 0; i < board.length; i++) {
            Arrays.fill(board[i], true);
        }
        return queens(board, 0);
    }

    public int queens(boolean[][] board, int r) {
        if (r == board.length) {
            return 1;
        }
        int count = 0;
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = false;
                count += queens(board, r + 1);
                board[r][c] = true;
            }
        }
        return count;
    }

    public boolean isSafe(boolean[][] board, int r, int c) {
        for (int i = 0; i < r; i++) {
            if (!board[i][c]) {
                return false;
            }
        }
        int maxLeft = Math.min(r, c);
        for (int i = 1; i <= maxLeft; i++) {
            if (!board[r - i][c - i]) {
                return false;
            }
        }

        int maxRight = Math.min(r, board.length - 1 - c);
        for (int i = 1; i <= maxRight; i++) {
            if (!board[r - i][c + i]) {
                return false;
            }
        }
        return true;
    }
}
