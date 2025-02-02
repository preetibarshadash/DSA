class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int[] index : indices) {
            int row = index[0];
            int col = index[1];
            for (int j = 0; j < n; j++) {
                matrix[row][j]++;
            }
            for (int i = 0; i < m; i++) {
                matrix[i][col]++;
            }
        }
        int count = 0;
        for (int[] row : matrix) {
            for (int col : row) {
                if (col % 2 != 0) {
                    count++;
                }
            }
        }
        return count;
    }
}
