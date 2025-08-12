class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int total = 0;
        for (int num : nums) {
            total += num;
        }
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            total -= nums[i];
            if (leftSum == total) {
                return i;
            }
            leftSum = leftSum + nums[i];
        }
        return -1;
    }
}
