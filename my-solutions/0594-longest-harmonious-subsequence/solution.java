class Solution {
    public int findLHS(int[] nums) {
        int n = nums.length, low = 0, high = 0;
        Arrays.sort(nums);
        int ans = 0;
        while (high < n) {
            int ele = nums[high];
            while ((ele - nums[low]) > 1) {
                low++;
            }
            if (ele - nums[low] == 1) {
                ans = Math.max(ans, high - low + 1);
            }
            high++;
        }
        return ans;
    }
}
