class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l = needle.length();
        for (int i = 0; i <= n - l; i++) {
            if (needle.equals(haystack.substring(i, i
                    + l)))
                return i;
        }
        return -1;
    }
}
