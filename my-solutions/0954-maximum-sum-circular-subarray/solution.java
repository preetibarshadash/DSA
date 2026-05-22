class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max = nums[0];
        int localMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            max = Math.max(max, localMax);
        }

        int totalArrSum = 0;
        for (int n : nums) {
            totalArrSum += n;
        }

        int min = nums[0];
        int localMin = nums[0];
        for (int i = 1; i < nums.length; i++) {
            localMin = Math.min(nums[i], localMin + nums[i]);
            min = Math.min(min, localMin);
        }

        if (max < 0)
            return max;
        return Math.max(max, totalArrSum - min);
    }
}
