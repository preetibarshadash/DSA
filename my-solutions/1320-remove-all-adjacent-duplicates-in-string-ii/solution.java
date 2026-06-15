class Solution {
    public String removeDuplicates(String s, int k) {
        int n = s.length();
        Stack<HashMap<Character, Integer>> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (!stack.isEmpty() && stack.peek().containsKey(c)) {
                HashMap<Character, Integer> topMap = stack.peek();
                int currentCount = topMap.get(c) + 1;
                if (currentCount == k) {
                    stack.pop();
                } else {
                    topMap.put(c, currentCount);
                }

            } else {
                HashMap<Character, Integer> newMap = new HashMap<>();
                newMap.put(c, 1);
                stack.push(newMap);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (HashMap<Character, Integer> map : stack) {
            for (char ch : map.keySet()) {
                int count = map.get(ch);
                for (int j = 0; j < count; j++) {
                    sb.append(ch);
                }
            }
        }

        return sb.toString();
    }
}
