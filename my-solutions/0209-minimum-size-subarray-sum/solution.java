class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0, high = 0;
        int minLength = Integer.MAX_VALUE;

        int n = nums.length;

        int sum = 0;

        while (high < n) {
            sum += nums[high];

            while (sum >= target) {
                int len = high - low + 1;
                minLength = Math.min(minLength, len);
                sum -= nums[low];
                low++;
            }

            high++;
        }

        return (minLength == Integer.MAX_VALUE )? 0 : minLength;
    }
}
