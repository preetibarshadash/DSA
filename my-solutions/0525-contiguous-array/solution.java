class Solution {
    public int findMaxLength(int[] nums) {
        int ans = 0, n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        int count0 = 0, count1 = 0;
        map.put(0, -1);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                count0++;
            } else {
                count1++;
            }
            int quest = count0 - count1;
            if (map.containsKey(quest)) {
                int idx = map.get(quest);
                ans = Math.max(ans, i - idx);
            } else
                map.put(quest, i);
        }
        return ans;
    }
}
