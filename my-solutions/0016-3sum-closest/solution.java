class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];

        for (int i = 0; i < n; i++) {
            int low = i + 1, high = n - 1;

            while (low < high) {
                int sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (sum == target)
                    return sum;
                if (sum > target) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return ans;
    }
}
