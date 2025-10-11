class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int[] curr = intervals[0];
        List<int[]> ans = new ArrayList<>();
        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];
            if (next[0] <= curr[1]) {
                curr[1] = Math.max(next[1], curr[1]);
            } else {
                ans.add(curr);
                curr = next;
            }
        }
        ans.add(curr);
        return ans.toArray(new int[ans.size()][]);
    }
}
