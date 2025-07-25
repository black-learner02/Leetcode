class Solution {
    public double myPow(double x, int n) {

       long pow = n;  // Convert to long to avoid overflow

        if (pow < 0) {
            x = 1 / x;
            pow = -pow;
        }

        return fastPow(x, pow);
    }

    public double fastPow(double x, long n) {
        double res = 1.0;

        while (n > 0) {
            if (n % 2 == 1) {  // If n is odd
                res *= x;
            }
            x *= x;
            n /= 2;
        }

       return res;

    }
}