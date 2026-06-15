class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> rMap = new HashMap<>();
        HashMap<Character, Integer> mMap = new HashMap<>();
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            rMap.put(c, rMap.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            mMap.put(c, mMap.getOrDefault(c, 0) + 1);
        }
        for (char c : rMap.keySet()) {
            if (mMap.getOrDefault(c, 0) < rMap.get(c)) {
                return false;
            }
        }
        return true;
    }
}
