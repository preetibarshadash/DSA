class Solution {
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.isEmpty())
            return new ArrayList<>();
        return combination("", digits);
    }

    public List<String> combination(String p, String up) {
        if (up.isEmpty()) {
            List<String> lst = new ArrayList<>();
            lst.add(p);
            return lst;
        }

        int digit = up.charAt(0) - '0';
        int i = (digit - 2) * 3;
        if (digit > 7) {
            i += 1;
        }

        int len = i + 3;
        if (digit == 7 || digit == 9) {
            len += 1;
        }
        List<String> ans = new ArrayList<>();
        for (; i < len; i++) {
            char c = (char) ('a' + i);
            ans.addAll(combination(p + c, up.substring(1)));
        }
        return ans;
    }
}
