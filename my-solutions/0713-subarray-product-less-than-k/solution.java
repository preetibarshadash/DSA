class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int n = nums.length, low = 0, high = 0;
        int ans = 0;
        int product = 1;
        while (high < n) {
            product *= nums[high];
            while (product >= k && low <= high) {
                product /= nums[low];
                low++;
            }
            ans += (high - low + 1);
            high++;
        }
        return ans;
    }
}
