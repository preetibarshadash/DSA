class Solution {
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    int helper(int[] arr, int target, int start, int end) {
        if (start > end)
            return -1;

        int mid = (end - start) / 2 + start;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] > target) {
            return helper(arr, target, start, mid - 1);
        } else {
            return helper(arr, target, mid + 1, end);
        }
    }
}
