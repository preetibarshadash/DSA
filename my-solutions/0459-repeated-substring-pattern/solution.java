class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for (int k = 1; k <= n / 2; k++) {
            if (n % k != 0)
                continue;

            int i = k;
            while (i < n && s.charAt(i) == s.charAt(i - k)) {
                i++;
            }
            if (i == n) {
                return true;
            }
        }
        return false;
    }
}
