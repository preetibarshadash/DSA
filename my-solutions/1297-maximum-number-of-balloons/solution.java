class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> need = new HashMap<>();
        need.put('b', 1);
        need.put('a', 1);
        need.put('l', 2);
        need.put('o', 2);
        need.put('n', 1);
        for (char c : text.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int ans = Integer.MAX_VALUE;
        for (char c : need.keySet()) {
            int cHave = map.getOrDefault(c, 0);
            int cNeed = need.get(c);
            ans = Math.min(ans, cHave / cNeed);
        }
        return ans;
    }
}
