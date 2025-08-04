class Solution {
    public int majorityElement(int[] nums) {
        int element = -1;
        int count = 0;
        int n = nums.length;
        for (int num : nums) {
            if (num == element) {
                count++;
            } else if (count == 0) {
                element = num;
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int num : nums) {
            if (num == element) {
                count++;
            }
        }

        if (count > n / 2) {
            return element;
        } else {
            return -1;
        }
    }
}
