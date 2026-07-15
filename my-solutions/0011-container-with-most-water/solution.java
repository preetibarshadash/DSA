class Solution {
    public int maxArea(int[] height) {
        int n = height.length;
        int ans = Integer.MIN_VALUE;
        int left = 0, right = n - 1;
        while (left < right) {
            int width = right - left;
            int h = Math.min(height[right], height[left]);
            int volume = width * h;
            ans = Math.max(ans, volume);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }
}
