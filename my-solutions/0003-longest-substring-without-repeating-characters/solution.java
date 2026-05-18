class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), low = 0, high = 0;
        int[] freq = new int[256];
        int ans = 0;
        while (high < n) {
            char c = s.charAt(high);
            freq[c]++;
            while (freq[c] > 1) {
                int lowC = s.charAt(low);
                freq[lowC]--;
                low++;
            }

            int window = high - low + 1;
            ans = Math.max(ans, window);
            high++;
        }
        return ans;
    }
}
