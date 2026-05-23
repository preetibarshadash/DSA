class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int n = nums.length, low = 0, high = 2;
        int ans = 0;
        while (high < n) {
            if (nums[high] - nums[high - 1] != nums[high - 1] - nums[high - 2]) {
                low = high - 1;
            }
            if (high - low >= 2)
                ans += high - low - 1;
            high++;
        }
        return ans;
    }
}
