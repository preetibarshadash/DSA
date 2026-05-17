class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, low = 2, high = 2;
        if (n <= 2)
            return n;
        while (high < n) {
            if (nums[high] != nums[low - 2]) {
                nums[low] = nums[high];
                low++;
            }
            high++;
        }
        return low;
    }
}
