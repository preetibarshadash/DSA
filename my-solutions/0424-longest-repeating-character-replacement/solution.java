class Solution {
    public int characterReplacement(String s, int k) {
        int low = 0, high = 0, n = s.length(), ans = 0, maxFreq = 0;
        int[] charArr = new int[255];

        while (high < n) {
            char c = s.charAt(high);
            charArr[c]++;
            maxFreq = Math.max(maxFreq, charArr[c]);

            int window = high - low + 1;
            int changeNeeded = window - maxFreq;
            while (changeNeeded > k) {
                char ch = s.charAt(low);
                charArr[ch]--;
                low++;
                window = high - low + 1;
                changeNeeded = window - maxFreq;
            }

            ans = Math.max(ans, window);
            high++;
        }

        return ans;
    }
}
