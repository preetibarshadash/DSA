class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n;){
            int correct = nums[i];
            if(correct < n && nums[i] != nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            }else{
                i++;
            }
        }
        for(int i = 0; i < n; i++){
            if(nums[i] != i){
                return i;
            }
        }
        return nums.length;
    }
}
