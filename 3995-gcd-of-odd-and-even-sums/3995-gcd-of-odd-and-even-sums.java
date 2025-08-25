class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        for(int i=1;i<=n+n;i++)
        {
           if(i%2==0)
           {
            sumeven+=i;
           }
           else
           {
            sumodd+=i;
           }
        }
        return findGCD(sumodd,sumeven);
    }
    public static int findGCD(int a, int b) {
        
        if (b == 0) {
            return a;
        }
        
        return findGCD(b, a % b);
    }
}