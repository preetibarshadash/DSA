class Solution {
    public int mySqrt(int x) {
        int start = 0;
        int end = x;
        while(start <= end){
            int mid = (end - start)/2 + start;
            long midSqrt = (long)mid * mid;
            if(midSqrt == x)
                return mid;
            if(midSqrt > x){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return end;
    }
}
