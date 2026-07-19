class Solution {
    public String smallestSubsequence(String s) {
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        StringBuilder stack = new StringBuilder();
        boolean[] seen = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';

            if (seen[idx]) {
                continue;
            }

            while (stack.length() > 0 && stack.charAt(stack.length() - 1) > c) {
                char topChar = stack.charAt(stack.length() - 1);

                if (lastIndex[topChar - 'a'] < i) {
                    break;
                }
                stack.deleteCharAt(stack.length() - 1);
                seen[topChar - 'a'] = false;
            }

            stack.append(c);
            seen[idx] = true;
        }

        return stack.toString();
    }
}

