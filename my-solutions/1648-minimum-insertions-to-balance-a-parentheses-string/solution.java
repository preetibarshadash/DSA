class Solution {
    public int minInsertions(String s) {
        int cnt = 0;
        int need = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                need += 2;

                if (need % 2 == 1) {
                    cnt++;
                    need--;
                }
            } else {
                need--;

                if (need < 0) {
                    cnt++;
                    need = 1;
                }
            }
        }

        return cnt + need;
    }
}

