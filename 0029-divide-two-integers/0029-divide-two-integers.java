
class Solution {
    public int divide(int dividend, int divisor) {

        // Overflow case
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        // Convert to long to handle Integer.MIN_VALUE safely
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        long result = 0;

        // Repeatedly subtract the largest shifted divisor
        while (a >= b) {
            long temp = b;
            long multiple = 1;

            while ((temp << 1) <= a) {
                temp <<= 1;
                multiple <<= 1;
            }

            a -= temp;
            result += multiple;
        }

        // Apply sign
        if ((dividend < 0) != (divisor < 0)) {
            result = -result;
        }

        return (int) result;
    }
}
