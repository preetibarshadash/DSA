class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int localMax = nums[0], localMin = nums[0], ans = nums[0];
        if (nums.length == 1) {
            return Math.abs(nums[0]);
        }

        for (int i = 1; i < nums.length; i++) {
            localMax = Math.max(nums[i], localMax + nums[i]);
            localMin = Math.min(nums[i], localMin + nums[i]);
            ans = Math.max(ans, Math.max(Math.abs(localMax), Math.abs(localMin)));
        }
        return ans;
    }
}
