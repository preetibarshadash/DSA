class Solution {
    public boolean backspaceCompare(String s, String t) {
        int n = s.length(), m = t.length();
        int i = n - 1, j = m - 1;
        while (i >= 0 || j >= 0) {
            int sCount = 0;
            while (i >= 0) {
                if (s.charAt(i) == '#') {
                    sCount++;
                    i--;
                } else if (sCount > 0) {
                    sCount--;
                    i--;
                } else {
                    break;
                }

            }
            int tCount = 0;
            while (j >= 0) {
                if (t.charAt(j) == '#') {
                    tCount++;
                    j--;
                } else if (tCount > 0) {
                    tCount--;
                    j--;
                } else {
                    break;
                }
            }

            if ((i >= 0) != (j >= 0)) {
                return false;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }

            i--;
            j--;
        }
        return true;
    }
}
