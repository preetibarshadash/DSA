class Solution {
    public int arraySign(int[] nums) {
        long prod = 1;
        for (int n : nums) {
            if (n > 0)
                prod *= 1;
            else if (n < 0)
                prod *= -1;
            else
                prod *= 0;
        }
        return signFunc(prod);
    }

    public int signFunc(long prod) {
        if (prod > 0)
            return 1;
        else if (prod < 0)
            return -1;
        else
            return 0;
    }
}

