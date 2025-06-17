class Solution {
    public int countTriples(int n) {
        int cnt=0;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                int c=i*i+j*j;
                int c1=(int)Math.sqrt(c);
                if(c1<=n && c1*c1==c)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}