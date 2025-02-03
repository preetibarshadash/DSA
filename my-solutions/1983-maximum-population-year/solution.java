class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] pop = new int[101];

        for (int[] log : logs) {
            pop[log[0] - 1950]++;
            pop[log[1] - 1950]--;
        }

        int maxYear = 1950, maxPop = pop[0];

        for (int i = 1; i < 101; i++) {
            pop[i] += pop[i - 1];
            if (pop[i] > maxPop) {
                maxPop = pop[i];
                maxYear = 1950 + i;
            }
        }

        return maxYear;
    }
}
