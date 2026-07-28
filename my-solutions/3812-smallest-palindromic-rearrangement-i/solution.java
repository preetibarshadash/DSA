class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if (n <= 1) return s;
        int[] freq = new int[26];
        for (int i = 0; i < n; i++) {
            freq[s.charAt(i) - 'a']++;
        }

        char[] res = new char[n];
        int left = 0, right = n - 1;
        for (int c = 0; c < 26; c++) {
            while (freq[c] >= 2) {
                res[left++] = (char) ('a' + c);
                res[right--] = (char) ('a' + c);
                freq[c] -= 2;
            }
            if (freq[c] == 1) {
                res[n / 2] = (char) ('a' + c);
            }
        }

        return new String(res);
    }
}
