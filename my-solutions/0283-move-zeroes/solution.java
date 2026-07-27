class Solution {
    public void moveZeroes(int[] nums) {
        int low = 0;
        for (int high = 0; high < nums.length; high++) {
            if (nums[high] != 0) {
                if (high != low) {
                    int temp = nums[high];
                    nums[high] = nums[low];
                    nums[low] = temp;
                }
                low++;
            }
        }
    }
}
