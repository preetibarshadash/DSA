class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] reversed = reverse(image);
        for (int row = 0; row < reversed.length; row++) {
            for (int col = 0; col < reversed[row].length; col++) {
                if (reversed[row][col] == 1) {
                    reversed[row][col] = 0;
                } else {
                    reversed[row][col] = 1;
                }
            }
        }
        return reversed;
    }

    public int[][] reverse(int[][] matrix) {
        for (int[] row : matrix) {
            for (int i = 0, j = row.length - 1; i < j; i++, j--) {
                int temp = row[i];
                row[i] = row[j];
                row[j] = temp;
            }
        }
        return matrix;
    }
}
