class Solution {
    public void rotate(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] newMat = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            int k = rows - 1;
            for (int j = 0; j < cols; j++) {
                int n = matrix[i][j];
                newMat[j][rows - i - 1] = n;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = newMat[i][j];
            }
        }
    }
}
