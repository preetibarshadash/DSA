class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length, i = 0, j = i + 1;
        while (j < n) {
            if (nums[j - 1] == nums[j]) {
                j++;
            } else {
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }

        return i + 1;
    }
}
