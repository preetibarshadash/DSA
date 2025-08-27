class Solution {
    public int maximumWealth(int[][] accounts) {
        int ans = 0;
        for (int c = 0; c < accounts.length; c++) {
            int sum = 0;
            for (int b = 0; b < accounts[0].length; b++) {
                sum += accounts[c][b];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
