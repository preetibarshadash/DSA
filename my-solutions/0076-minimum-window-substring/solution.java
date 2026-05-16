class Solution {
    public String minWindow(String s, String t) {
        int n = s.length(), m = t.length();
        if (s == null || t == null || n < m)
            return "";
        int low = 0, high = 0;
        int minLen = Integer.MAX_VALUE;
        int[] tFreq = new int[256];
        int[] sFreq = new int[256];
        for (int i = 0; i < m; i++) {
            char c = t.charAt(i);
            tFreq[c]++;
        }
        int start = -1;
        int count = 0;
        while (high < n) {
            char c = s.charAt(high);
            sFreq[c]++;
            if (tFreq[c] > 0 && sFreq[c] <= tFreq[c]) {
                count++;
            }
            while (count == m) {
                int len = high - low + 1;
                if (len < minLen) {
                    minLen = len;
                    start = low;
                }
                char ch = s.charAt(low);
                sFreq[ch]--;
                if (tFreq[ch] > 0 && sFreq[ch] < tFreq[ch]) {
                    count--;
                }
                low++;
            }

            high++;
        }
        if (minLen == Integer.MAX_VALUE)
            return "";
        return s.substring(start, start + minLen);

    }

    public boolean helper(int[] arr1, int[] arr2) {
        for (int i = 0; i < 256; i++) {
            if (arr1[i] < arr2[i])
                return false;
        }
        return true;
    }
}
