class Solution {
    public boolean isHappy(int n) {
        int fast = n, slow = n;
        while (fast != 1) {
            slow = getSum(slow);
            fast = getSum(fast);
            fast = getSum(fast);
            if (fast == slow && fast != 1)
                return false;
        }
        return true;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * rem;
            n /= 10;
        }
        return sum;
    }
}
