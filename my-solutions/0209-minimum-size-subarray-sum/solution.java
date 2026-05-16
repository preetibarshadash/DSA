class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int minLen = Integer.MAX_VALUE;
        int n = nums.length, low = 0, high = 0;
        int sum = 0;
        while (high < n) {
            sum += nums[high];
            while (sum >= target) {
                int len = high - low + 1;
                minLen = Math.min(minLen, len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}
