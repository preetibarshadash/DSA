class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int[] prefixGcd = new int[n];
        int mxi = nums[0];
        prefixGcd[0] = nums[0];
        for (int i = 1; i < n; i++) {
            mxi = Math.max(mxi, nums[i]);
            prefixGcd[i] = gcd(nums[i], mxi);
        }
        Arrays.sort(prefixGcd);
        int left = 0, right = n - 1;
        long sum = 0;
        while (left < right) {
            sum += gcd(prefixGcd[left], prefixGcd[right]);
            left++;
            right--;
        }
        return sum;
    }

    public int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
