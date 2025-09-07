class Solution {
    public int reverse(int x) {
        boolean isNegative = x < 0;
        x = Math.abs(x);
        int rev = 0;

        while (x != 0) {
            int rem = x % 10;

            // Check overflow before multiplying
            if (rev > (Integer.MAX_VALUE - rem) / 10) {
                return 0; // Overflow case
            }

            rev = rev * 10 + rem;
            x /= 10;
        }

        return isNegative ? -rev : rev;
    }
}
