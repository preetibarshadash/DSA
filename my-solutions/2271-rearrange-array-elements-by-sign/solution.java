class Solution {
    public int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> positives = new ArrayList<>();
        ArrayList<Integer> negatives = new ArrayList<>();
        int[] ans = new int[nums.length];

        for (int n : nums) {
            if (n >= 0)
                positives.add(n);
            else
                negatives.add(n);
        }

        int posIdx = 0;
        int negIdx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                ans[i] = positives.get(posIdx);
                posIdx++;
            } else {
                ans[i] = negatives.get(negIdx);
                negIdx++;
            }
        }
        return ans;
    }
}
