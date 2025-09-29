class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr = word.toCharArray();
        int found = search(arr, ch);
        if (found == -1) {
            return word;
        }
        reverse(arr, 0, found);
        return String.valueOf(arr);
    }

    public void reverse(char[] arr, int start, int end) {
        if (start > end)
            return;
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }

    public int search(char[] arr, char target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
