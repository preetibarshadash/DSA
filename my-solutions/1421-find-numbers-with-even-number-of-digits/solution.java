class Solution {
    public int findNumbers(int[] nums) {
        int ans = 0;
        for (int n : nums) {
            int count = countDigits(n);
            if (count % 2 == 0) {
                ans++;
            }
        }
        return ans;
    }

    public int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }
}
