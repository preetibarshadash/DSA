class Solution {
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        int n = nums.length, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            int quest = sum - k;
            if (map.get(quest) != null)
                ans += map.get(quest);

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }
}
