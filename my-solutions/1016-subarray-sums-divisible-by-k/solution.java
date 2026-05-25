class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum = 0;
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int quest = sum % k;
            if (quest < 0) {
                quest = quest + k;
            }
            if (map.get(quest) != null)
                ans += map.get(quest);

            map.put(quest, map.getOrDefault(quest, 0) + 1);
        }
        return ans;
    }
}
