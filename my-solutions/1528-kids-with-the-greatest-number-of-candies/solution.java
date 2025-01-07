class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> ans = new ArrayList<>();
        int max  = candies[0];
        for(int i = 0;i<candies.length;i++){
            int currentMax = candies[i];
            if(currentMax>max){
                max = currentMax;
            }
        }
        for(int element:candies){
            int total = element+extraCandies;
            if(total>=max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }
        return ans;
     }
}
