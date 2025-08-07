class Solution {
    public List<List<String>> solveNQueens(int n) {
        boolean[][] board = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], true);
        }
        return queens(board, 0);
    }

    private List<List<String>> queens(boolean[][] board, int r) {
        List<List<String>> ans = new ArrayList<>();
        if (board.length == r) {
            ans.add(display(board));
            return ans;
        }
        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = false;
                ans.addAll(queens(board, r + 1));
                board[r][c] = true;
            }
        }
        return ans;
    }

    private boolean isSafe(boolean[][] board, int r, int c) {
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

        int maxRight = Math.min(r, board.length - c - 1);
        for (int i = 1; i <= maxRight; i++) {
            if (!board[r - i][c + i]) {
                return false;
            }
        }
        return true;
    }

    private List<String> display(boolean[][] board) {
        List<String> result = new ArrayList<>();
        for (boolean[] row : board) {
            StringBuilder sb = new StringBuilder();
            for (boolean cell : row) {
                sb.append(cell ? '.' : 'Q');
            }
            result.add(sb.toString());
        }
        return result;
    }
}
