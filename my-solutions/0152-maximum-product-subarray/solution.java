class Solution {
    public int maxProduct(int[] nums) {
        int localMax = nums[0], localMin = nums[0], ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = localMax;
                localMax = localMin;
                localMin = temp;
            }
            localMax = Math.max(localMax * nums[i], nums[i]);
            localMin = Math.min(localMin * nums[i], nums[i]);
            ans = Math.max(ans, Math.max(localMax, localMin));
        }

        return ans;
    }
}
