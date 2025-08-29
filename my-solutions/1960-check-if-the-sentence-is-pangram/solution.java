class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> set = new HashSet<>();

        for (char c = 0; c < sentence.length(); c++) {
            char ch = sentence.charAt(c);
            if (ch >= 'a' && ch <= 'z') {
                set.add(ch);
            }
        }

        return set.size() == 26;
    }
}
