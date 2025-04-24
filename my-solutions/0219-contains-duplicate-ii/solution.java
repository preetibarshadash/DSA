class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> isDuplicate = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (isDuplicate.containsKey(nums[i])) {
                if (i - isDuplicate.get(nums[i]) <= k) {
                    return true;
                }
            }
            isDuplicate.put(nums[i], i);
        }
        return false;
    }
}
