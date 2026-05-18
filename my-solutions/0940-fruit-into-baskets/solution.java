class Solution {
    public int totalFruit(int[] fruits) {
        int n = fruits.length;
        int k = 2;
        int low = 0, high = 0;
        int ans = Integer.MIN_VALUE;
        Map<Integer, Integer> freq = new HashMap<>();
        while (high < n) {
            freq.put(fruits[high], freq.getOrDefault(fruits[high], 0) + 1);
            while (freq.size() > k) {
                int lowEle = fruits[low];
                freq.put(lowEle, freq.getOrDefault(lowEle, 0) - 1);
                if (freq.get(lowEle) == 0) {
                    freq.remove(lowEle);
                }
                low++;
            }
            ans = Math.max(ans, high - low + 1);
            high++;
        }
        return ans;
    }
}
