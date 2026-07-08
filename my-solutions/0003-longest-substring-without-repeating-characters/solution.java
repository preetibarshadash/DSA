class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), low = 0, high = 0;
        int longest = Integer.MIN_VALUE;
        int[] freq = new int[256];
        while (high < n) {
            char highEle = s.charAt(high);
            freq[highEle]++;
            while (freq[highEle] > 1) {
                freq[s.charAt(low)]--;
                low++;
            }
            int len = high - low + 1;
            longest = Math.max(longest, len);
            high++;
        }

        return longest == Integer.MIN_VALUE ? 0 : longest;
    }
}
