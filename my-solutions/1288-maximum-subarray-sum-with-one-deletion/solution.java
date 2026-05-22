class Solution {
    public int maximumSum(int[] arr) {
        int onedelete = 0;
        int nodelete = arr[0];
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {
            int prevNoDelete = nodelete;
            nodelete = Math.max(arr[i], nodelete + arr[i]);
            onedelete = Math.max(onedelete + arr[i], prevNoDelete);
            ans = Math.max(ans, Math.max(onedelete, nodelete));
        }
        return ans;
    }
}
