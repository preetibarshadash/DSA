class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();

        sort(s1, 0, s1.length - 1);
        sort(t1, 0, t1.length - 1);

        return String.valueOf(s1).equals(String.valueOf(t1));
    }

    public void sort(char[] s, int low, int high) {
        if (low >= high) {
            return;
        }

        int start = low;
        int end = high;
        char pivot = s[low + (high - low) / 2];

        while (start <= end) {
            while (s[start] < pivot) {
                start++;
            }
            while (s[end] > pivot) {
                end--;
            }
            if (start <= end) {
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }
        }

        sort(s, low, end);
        sort(s, start, high);
    }
}

