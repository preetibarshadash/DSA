class Solution {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int l = needle.length();

        if (needle.isEmpty())
            return -1;

        for (int i = 0; i <= n - l; i++) {
            if (haystack.substring(i, i + l).equals(needle))
                return i;
        }
        return -1;
    }
}
