class Solution {
    public int findDuplicate(int[] nums) {
        int fast = 0, slow = 0, n = nums.length;
        while (true) {
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];
            if (slow == fast) {
                slow = 0;
                while (slow != fast) {
                    slow = nums[slow];
                    fast = nums[fast];
                }
                return slow;
            }
        }
        // return -1;
    }
}
