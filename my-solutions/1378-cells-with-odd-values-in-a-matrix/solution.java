class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int[] idx : indices) {
            int row = idx[0];
            int col = idx[1];
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }
        }
        int ans = 0;
        for (int[] row : matrix) {
            for (int column : row) {
                if (column % 2 != 0)
                    ans++;
            }
        }
        return ans;
    }
}
