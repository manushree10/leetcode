class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=1)
        {
            return false;
        }
        int sum=1;
        for(int i=2;i<=Math.sqrt(num);i++)
        {
            if(num%i==0)
            {
                sum+=i;
                int n=num/i;
                if(n!=i)
                {
                    sum+=n;
                }
            }
            
        }
        return sum==num;
    }
}