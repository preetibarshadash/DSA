class Solution {

    public int maximumGap(String skill, String station) {
        int n = skill.length();
        int m = station.length();
        if (n <= 1)
            return 0;
        int[] left = new int[n];
        int sIdx = 0;
        for (int i = 0; i < n; i++) {
            while (sIdx < m && station.charAt(sIdx) != skill.charAt(i)) {
                sIdx++;
            }
            left[i] = sIdx;
            sIdx++;
        }

        int[] right = new int[n];
        sIdx = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            while (sIdx >= 0 && station.charAt(sIdx) != skill.charAt(i)) {
                sIdx--;
            }
            right[i] = sIdx;
            sIdx--;
        }
        int gap = 0;
        for (int i = 1; i < n; i++) {
            gap = Math.max(gap, right[i] - left[i - 1]);
        }
        return gap;
    }
    // helper(skill, station, 0, 0, arr);
    // return maxGap;

    // public void helper(String skill, String station, int idx, int stIdx, int[] arr) {
    //     int n = skill.length();
    //     int m = station.length();

    //     if (idx == n) {
    //         int currMaxGap = 0;
    //         for (int i = 1; i < n; i++) {
    //             currMaxGap = Math.max(currMaxGap, arr[i] - arr[i - 1]);
    //         }
    //         maxGap = Math.max(maxGap, currMaxGap);
    //         return;
    //     }
    //     for (int j = stIdx; j < m; j++) {
    //         if (station.charAt(j) == skill.charAt(idx)) {
    //             arr[idx] = j;
    //             helper(skill, station, idx + 1, j + 1, arr);
    //         }
    //     }
    // }
}
