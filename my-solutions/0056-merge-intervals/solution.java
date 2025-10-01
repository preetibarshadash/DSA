class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> ans = new ArrayList<>();
        int[] currInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] nextInterval = intervals[i];
            if (nextInterval[0] <= currInterval[1]) {
                currInterval[1] = Math.max(nextInterval[1], currInterval[1]);
            } else {
                ans.add(currInterval);
                currInterval = nextInterval;
            }
        }
        ans.add(currInterval);
        return ans.toArray(new int[ans.size()][]);
    }
}
