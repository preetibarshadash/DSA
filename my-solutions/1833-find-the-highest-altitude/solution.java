class Solution {
    public int largestAltitude(int[] gain) {
        int initialAlt = 0;
        int[] alt = new int[gain.length + 1];

        for(int i = 0; i < gain.length; i++){
            initialAlt += gain[i];
            alt[i] = initialAlt;
        }

        int max = Integer.MIN_VALUE;
        for(int ele : alt){
            if(ele > max){
                max = ele;
            }
        }
        return max;
    }
}
