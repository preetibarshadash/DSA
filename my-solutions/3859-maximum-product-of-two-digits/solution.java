class Solution {
    public int maxProduct(int n) {
        int[] digits = new int[10];
        while (n > 0) {
            int d = n % 10;
            digits[d]++;
            n /= 10;
        }
        int first = -1, second = -1;
        for (int i = digits.length - 1; i >= 0; i--) {
            while (digits[i] > 0) {
                if (first == -1)
                    first = i;
                else if (second == -1) {
                    second = i;
                    return first * second;
                }
                digits[i]--;
            }
        }
        return first * second;
    }
}
