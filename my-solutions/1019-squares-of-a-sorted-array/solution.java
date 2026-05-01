class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, n = nums.length, j = n - 1;
        int[] ans = new int[n];
        for (int k = n - 1; k >= 0; k--) {
            int lowSqrd = nums[i] * nums[i];
            int highSqrd = nums[j] * nums[j];
            if (lowSqrd > highSqrd) {
                ans[k] = lowSqrd;
                i++;
            } else {
                ans[k] = highSqrd;
                j--;
            }
        }
        return ans;

    }
}
