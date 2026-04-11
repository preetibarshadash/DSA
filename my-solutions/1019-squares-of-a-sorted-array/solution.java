class Solution {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] positives = new int[n];
        int[] negatives = new int[n];
        int p = 0;
        int neg = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= 0) {
                positives[p] = nums[i];
                p++;
            } else {
                negatives[neg] = nums[i];
                neg++;
            }
        }

        for (int j = 0; j < p; j++) {
            positives[j] = positives[j] * positives[j];
        }

        for (int k = 0; k < neg; k++) {
            negatives[k] = negatives[k] * negatives[k];
        }

        reverse(negatives, 0, neg - 1);
       

        int[] result = new int[n];
        int idx = 0;
        int a = 0, b = 0;

        while (a < p && b < neg) {
            if (positives[a] < negatives[b]) {
                result[idx] = positives[a];
                idx++;
                a++;
            } else {
                result[idx] = negatives[b];
                idx++;
                b++;
            }
        }

        while (a < p) {
            result[idx++] = positives[a++];
        }
        while (b < neg) {
            result[idx++] = negatives[b++];
        }
        return result;
    }

    public void reverse(int[] arr, int start, int end) {
        if (start > end)
            return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverse(arr, start + 1, end - 1);
    }
}
