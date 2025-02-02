class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();

        int n = num.length;
        int carry = k;

        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }

        while (carry > 0) {
            result.add(carry % 10);
            carry /= 10;
        }

        Collections.reverse(result);

        return result;
    }
}
