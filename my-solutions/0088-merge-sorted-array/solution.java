class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastIndexOfNums1 = m + n - 1;
        int lastElementOfNums1 = m - 1;
        int lastElementOfNums2 = n - 1;

        while (lastElementOfNums1 >= 0 && lastElementOfNums2 >= 0) {
            if (nums1[lastElementOfNums1] > nums2[lastElementOfNums2]) {
                nums1[lastIndexOfNums1] = nums1[lastElementOfNums1];
                lastElementOfNums1--;
            } else {
                nums1[lastIndexOfNums1] = nums2[lastElementOfNums2];
                lastElementOfNums2--;
            }
            lastIndexOfNums1--;
        }

        while (lastElementOfNums2 >= 0) {
            nums1[lastIndexOfNums1] = nums2[lastElementOfNums2];
            lastElementOfNums2--;
            lastIndexOfNums1--;
        }
    }
}
