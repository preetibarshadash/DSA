class Solution {
    public int maxProduct(int[] nums) {
        int localMin = nums[0], localMax = nums[0], max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = localMax;
                localMax = localMin;
                localMin = temp;
            }
            localMin = Math.min(nums[i], localMin * nums[i]);
            localMax = Math.max(nums[i], localMax * nums[i]);
            max = Math.max(max, Math.max(localMin, localMax));
        }
        return max;
    }
}
