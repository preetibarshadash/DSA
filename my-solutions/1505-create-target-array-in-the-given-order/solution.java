class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int[] ans = new int[nums.length];
        for(int n=0;n<nums.length;n++){
            
                int in = index[n];
                if(ans[in]!=-1){
                    for(int j = nums.length-1;j>in;j--){
                        ans[j]=ans[j-1];
                    }
                }
                ans[in]=nums[n];
            
        }
        return ans;
    }
}
