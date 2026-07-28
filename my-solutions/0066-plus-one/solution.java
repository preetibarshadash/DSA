import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        BigInteger number = BigInteger.ZERO;
        for (int i = 0; i < n; i++) {
            number = number.multiply(BigInteger.TEN).add(BigInteger.valueOf(digits[i]));
        }

        number = number.add(BigInteger.ONE);
        List<Integer> ans = new ArrayList<>();
        while (number.compareTo(BigInteger.ZERO) > 0) {
            BigInteger dig = number.mod(BigInteger.TEN);
            ans.add(dig.intValue());
            number = number.divide(BigInteger.TEN);
        }

        int[] ansArr = new int[ans.size()];
        int idx = 0;
        for (int i = ans.size() - 1; i >= 0; i--) {
            ansArr[idx] = ans.get(i);
            idx++;
        }

        return ansArr;
    }
}
