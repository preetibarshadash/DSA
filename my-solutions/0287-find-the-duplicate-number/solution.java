class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visited[nums[i]]) {
                return nums[i];
            }
            visited[nums[i]] = true;
        }
        return -1;
    }
}
