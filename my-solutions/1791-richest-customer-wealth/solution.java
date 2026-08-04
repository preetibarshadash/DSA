class Solution {
    public int maximumWealth(int[][] accounts) {
        int noOfCusts = accounts.length;
        int noOfBanks = accounts[0].length;
        int ans = Integer.MIN_VALUE;
        for (int i = 0; i < noOfCusts; i++) {
            int sum = 0;
            for (int j = 0; j < noOfBanks; j++) {
                sum += accounts[i][j];
            }
            ans = Math.max(ans, sum);
        }
        return ans;
    }
}
