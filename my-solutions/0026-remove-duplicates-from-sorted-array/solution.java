class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, i = 0, j = 0;
        while (j < n) {
            if (nums[i] == nums[j]) {
                j++;
            } else {
                int t = nums[i + 1];
                nums[i + 1] = nums[j];
                nums[j] = t;
                i++;
                j++;
            }
        }
        return i + 1;
    }
}
