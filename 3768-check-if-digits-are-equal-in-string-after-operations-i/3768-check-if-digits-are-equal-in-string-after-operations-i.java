class Solution {
    public boolean hasSameDigits(String s) {
        int n=s.length();
        int[] t=new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = s.charAt(i) - '0';
        }
        for(int j=n;j>2;j--)
        {
            for(int i=0;i<j-1;i++)
            {
                t[i]=(t[i]+t[i+1])%10;
            }
        }
        return t[0]==t[1];
    }
}