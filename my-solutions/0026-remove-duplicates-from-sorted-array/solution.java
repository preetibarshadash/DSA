class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, low = 0, high = 0;
        while (high < n) {
            if (nums[low] == nums[high])
                high++;
            else {
                int temp = nums[low + 1];
                nums[low + 1] = nums[high];
                nums[high] = temp;
                low++;
                high++;
            }
        }
        return low + 1;
    }
}
