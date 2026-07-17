class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        int maxVal = 0;
        for (int num : nums) {
            maxVal = Math.max(maxVal, num);
        }

        long[] count = new long[maxVal + 1];
        for (int num : nums) {
            count[num]++;
        }

        long[] gcdPairs = new long[maxVal + 1];
        for (int i = 1; i <= maxVal; i++) {
            long multiplesCount = 0;
            for (int j = i; j <= maxVal; j += i) {
                multiplesCount += count[j];
            }
            gcdPairs[i] = (multiplesCount * (multiplesCount - 1)) / 2;
        }

        for (int i = maxVal; i >= 1; i--) {
            for (int j = 2 * i; j <= maxVal; j += i) {
                gcdPairs[i] -= gcdPairs[j];
            }
        }

        for (int i = 1; i <= maxVal; i++) {
            gcdPairs[i] += gcdPairs[i - 1];
        }

        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ans[i] = binarySearch(gcdPairs, queries[i]);
        }

        return ans;
    }

    private int binarySearch(long[] prefixSums, long target) {
        int low = 1, high = prefixSums.length - 1;
        int result = high;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (prefixSums[mid] > target) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}

