class Solution {
    public boolean[] transformStr(String s, String[] strs) {
        int n = s.length();
        int count0 = 0;

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0')
                count0++;
        }

        List<Boolean> ans = new ArrayList<>();

        for (String str : strs) {
            int zeroes = 0, marks = 0;
            for (int i = 0; i < n; i++) {
                if (str.charAt(i) == '0')
                    zeroes++;
                if (str.charAt(i) == '?')
                    marks++;
            }

            int needed = count0 - zeroes;
            if (needed < 0 || needed > marks) {
                ans.add(false);
                continue;
            }
            int s0 = 0, str0 = 0, placed0 = 0;
            boolean possible = true;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0')
                    s0++;

                if (str.charAt(i) == '0')
                    str0++;
                else if (str.charAt(i) == '?') {
                    if (placed0 < needed) {
                        str0++;
                        placed0++;
                    }
                }
                if (str0 < s0) {
                    possible = false;
                    break;
                }
            }
            ans.add(possible);
        }
        boolean[] arr = new boolean[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            arr[i] = ans.get(i);
        }
        return arr;
    }
}
