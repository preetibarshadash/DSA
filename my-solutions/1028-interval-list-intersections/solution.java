class Solution {
    public int[][] intervalIntersection(int[][] firstList, int[][] secondList) {
        List<int[]> intersections = new ArrayList<>();
        int i = 0, j = 0;
        int n = firstList.length, m = secondList.length;

        while (i < n && j < m) {
            int s1 = firstList[i][0];
            int e1 = firstList[i][1];
            int s2 = secondList[j][0];
            int e2 = secondList[j][1];

            int start = Math.max(s1, s2);
            int end = Math.min(e1, e2);

            if (start <= end) {
                intersections.add(new int[] { start, end });
            }

            if (e1 <= e2) {
                i++;
            } else {
                j++;
            }
        }

        return intersections.toArray(new int[intersections.size()][]);
    }
}
