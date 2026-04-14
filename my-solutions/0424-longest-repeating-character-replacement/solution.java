class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26];

        int left = 0, maxFreq = 0, maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            // increase frequency
            freq[c - 'A']++;

            // track max frequency in window
            maxFreq = Math.max(maxFreq, freq[c - 'A']);

            // if window is invalid, shrink
            while ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                freq[leftChar - 'A']--;
                left++;
            }

            // update answer
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
