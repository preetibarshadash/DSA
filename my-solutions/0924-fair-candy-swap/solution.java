class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0, sumBob = 0;

        for (int candy : aliceSizes) {
            sumAlice += candy;
        }
        for (int candy : bobSizes) {
            sumBob += candy;
        }

        int diff = (sumAlice - sumBob) / 2;

        HashSet<Integer> aliceSet = new HashSet<>();
        for (int candy : aliceSizes) {
            aliceSet.add(candy);
        }

        for (int candy : bobSizes) {
            if (aliceSet.contains(candy + diff)) {
                return new int[] { candy + diff, candy };
            }
        }

        return new int[0];
    }
}
