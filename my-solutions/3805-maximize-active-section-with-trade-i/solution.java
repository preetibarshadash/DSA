class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        int n = s.length();
        int originalOnes = 0;
        int maxGain = 0;
        int preZeroLen = Integer.MIN_VALUE;

        int i = 0;
        while (i < n) {
            int j = i + 1;
            while (j < n && s.charAt(j) == s.charAt(i)) {
                j++;
            }

            int curLen = j - i;

            if (s.charAt(i) == '1') {
                originalOnes += curLen;
            } else {
                if (preZeroLen != Integer.MIN_VALUE) {
                    maxGain = Math.max(maxGain, preZeroLen + curLen);
                }
                preZeroLen = curLen;
            }

            i = j;
        }

        return originalOnes + maxGain;
    }
}
