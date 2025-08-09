class Solution {
    public boolean isPowerOfTwo(int n) {

        // if (n <= 0) return false;
        // return (n & (n - 1)) == 0;

        for(int i=0;i<32;i++)
        {
            if(Math.pow(2,i)==n)
            return true;
        }
        return false;
    }
}