class Solution {
    public int maxSubArray(int[] nums) {
        int localMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], nums[i] + localMax);
            max = Math.max(max, localMax);
        }

        return max;
    }
}
