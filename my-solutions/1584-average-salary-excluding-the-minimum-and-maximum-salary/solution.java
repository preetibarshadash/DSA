class Solution {
    public double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int sal : salary) {
            min = Math.min(min, sal);
            max = Math.max(max, sal);
        }

        for (int sal : salary) {
            if (sal == min || sal == max)
                continue;
            else
                sum += sal;
        }
        return (double) sum / (salary.length - 2);
    }
}
