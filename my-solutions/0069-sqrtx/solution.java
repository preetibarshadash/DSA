public class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        return binarySearch(0, x, x);
    }

    public int binarySearch(int s, int e, int x) {
        if (s > e) {
            return e;
        }

        int mid = s + (e - s) / 2; 
        long midSquared = (long) mid * mid; 
        if (midSquared == x) {
            return mid; 
        }

        if (midSquared < x) {
            return binarySearch(mid + 1, e, x); 
        } else {
            return binarySearch(s, mid - 1, x); 
        }
    }
}

