class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int[] result = new int[n];

        if (k == 0) {
            return result;
        }

        int start = 0;
        int end = 0;

        if (k > 0) {
            start = 1;
            end = k;
        } else {
            start = n - Math.abs(k);
            end = n - 1;
        }

        int currentWindowSum = 0;
        for (int i = start; i <= end; i++) {
            currentWindowSum += code[i];
        }

        for (int i = 0; i < n; i++) {
            result[i] = currentWindowSum;
            currentWindowSum -= code[start];
            start = (start + 1) % n;
            end = (end + 1) % n;
            currentWindowSum += code[end];
        }

        return result;
    }
}
