class Solution {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = 0;
        boolean odd = false;
        for (char c : map.keySet()) {
            int val = map.get(c);
            if (val % 2 == 0)
                ans += val;
            else
                odd = true;
        }
        if (!odd)
            return ans;
        else {
            for (char c : map.keySet()) {
                int val = map.get(c);
                if (val % 2 == 1)
                    ans += val - 1;
            }
            return ans + 1;
        }
    }
}
