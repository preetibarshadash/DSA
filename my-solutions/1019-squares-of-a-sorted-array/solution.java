class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = 0;
        while(j < nums.length){
            nums[i] = nums[j] * nums[j];
            j++;
            i++;
        }
        Arrays.sort(nums);
        return nums;
    }
}
