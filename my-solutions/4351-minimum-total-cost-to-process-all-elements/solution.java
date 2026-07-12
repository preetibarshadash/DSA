class Solution {
    public int minimumCost(int[] nums, int k) {
        long cost = 0;
        long resources = k;
        int n = nums.length;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > resources) {
                long lacking = nums[i] - resources;
                long needed = (lacking + k - 1) / k;
                count += needed;
                resources += needed * k;
            }
            resources -= nums[i];
        }
        cost = (count % 1000000007) * ((count + 1) % 1000000007) % 1000000007;
        cost = (cost * 500000004) % 1000000007;
        return (int) cost;
    }
}
