class Solution {
    public int search(int[] nums, int target) {
        int pivot = pivot(nums);
        if (pivot == -1)
            return orderAgnosticBS(nums, target, 0, nums.length - 1);
        int first = orderAgnosticBS(nums, target, 0, pivot);
        if (first == -1) {
            return orderAgnosticBS(nums, target, pivot + 1, nums.length - 1);
        }
        return first;
    }

    public int pivot(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && array[mid] > array[mid + 1])
                return mid;
            if (mid > start && array[mid - 1] > array[mid])
                return mid - 1;
            if (array[mid] > array[start])
                start = mid + 1;
            else
                end = mid - 1;
        }
        return -1;
    }

    public int orderAgnosticBS(int[] array, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (array[mid] == target)
                return mid;

            if (array[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }
}
