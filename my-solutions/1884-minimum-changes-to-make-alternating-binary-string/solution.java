class Solution {
    public int minOperations(String s) {
        int ans = 0;
        char[] letters = s.toCharArray();
        int i = 0, j = i + 1;
        while (j < letters.length) {
            if (letters[i] != letters[j]) {
                i++;
                j++;
            } else {
                if (letters[i] == '0') {
                    letters[j] = '1';
                } else {
                    letters[j] = '0';
                }
                i++;
                j++;
                ans++;
            }
        }
        return Math.min(ans, letters.length - ans);
    }
}
