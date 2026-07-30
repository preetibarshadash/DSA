class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean isIncreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                isIncreasing = false;
                break;
            }
        }

        boolean isDecreasing = true;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                isDecreasing = false;
                break;
            }
        }
        return isIncreasing || isDecreasing;
    }
}
