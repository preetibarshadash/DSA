class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        String ans = s.substring(0, 1);
        for (int i = 0; i < n; i++) {
            String odd = helper(s, i, i);
            String even = helper(s, i, i + 1);
            if (odd.length() > ans.length()) {
                ans = odd;
            }
            if (even.length() > ans.length()) {
                ans = even;
            }
        }
        return ans;
    }

    public String helper(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
