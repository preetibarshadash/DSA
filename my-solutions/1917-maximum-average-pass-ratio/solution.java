class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<double[]> q = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));

        for (int[] c : classes) {
            int p = c[0], t = c[1];
            q.offer(new double[] { gain(p, t), p, t });
        }

        while (extraStudents-- > 0) {
            double[] top = q.poll();
            int p = (int) top[1];
            int t = (int) top[2];
            p++;
            t++;
            q.offer(new double[] { gain(p, t), p, t });
        }

        double sum = 0.0;
        while (!q.isEmpty()) {
            double[] top = q.poll();
            sum += (double) top[1] / top[2];
        }
        return sum / classes.length;
    }

    private double gain(int p, int t) {
        return ((double) (p + 1) / (t + 1)) - ((double) p / t);
    }
}

