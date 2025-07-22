class Solution {
    public int splitArray(int[] array, int m) {
        int start = 0, end = 0;
        for (int i = 0; i < array.length; i++) {
            start = Math.max(start, array[i]);
            end += array[i];
        }

        while (start < end) {
            int pieces = 1;
            int currentSum = 0;
            int maxSumAllowed = start + (end - start) / 2;
            for (int num : array) {
                if (currentSum + num > maxSumAllowed) {
                    currentSum = num;
                    pieces++;
                } else {
                    currentSum += num;
                }
            }
            if (pieces > m) start = maxSumAllowed + 1;
            else end = maxSumAllowed;
        }
        return end;
    }
}
