class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> chars = new HashSet<>();
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') {
                chars.add(c);
            }
        }
        return chars.size() == 26;
    }
}
