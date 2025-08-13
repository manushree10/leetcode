class Solution {
    public int[] plusOne(int[] digits) {
        int n=digits.length;
        for(int i=n-1;i>=0;i--)
        {
            if(digits[i]+1!=10)
            {
                digits[i]+=1;
                return digits;
            }
            digits[i]=0;
        }
        int[] ndigit=new int[n+1];
        ndigit[0]=1;
        return ndigit;
    }
}