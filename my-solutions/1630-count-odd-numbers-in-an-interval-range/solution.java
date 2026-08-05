class Solution {
    public int countOdds(int low, int high) {
        int total = high - low + 1;
        int half = total / 2;

        if (total % 2 != 0 && (low % 2 != 0 || high % 2 != 0)) {
            return half + 1;
        }

        return half;
    }
}

