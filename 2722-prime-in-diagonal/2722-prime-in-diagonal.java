class Solution {
    boolean prime(int left)
    {
        boolean flag=true;
        for(int i=2;i*i<=left;i++)
        {
            if(left%i==0)return false;
        }
        return flag;
    }
    public int diagonalPrime(int[][] nums) {
        int n=nums.length;
        int maxx=0;
        for(int i=0;i<n;i++)
        {
            int l=nums[i][i];
            int r=nums[i][n-i-1];
            boolean k=prime(l);
            boolean m=prime(r);

            if(k){
                maxx=Math.max(l,maxx);
                
            }
            if(m)
            {
                maxx=Math.max(r,maxx);
            }
        }
        if(maxx==1)return 0;
        return maxx;
    }
}