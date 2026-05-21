class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        while (fast != 1) {
            slow = getSum(slow);
            fast = getSum(fast);
            fast = getSum(fast);
            if (slow == fast && fast != 1)
                return false;
        }
        return true;
    }

    public int getSum(int n) {
        int sum = 0;
        while (n > 0) {
            int dig = n % 10;
            sum += dig * dig;
            n /= 10;
        }
        return sum;
    }
}
