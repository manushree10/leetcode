class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length;
        int maxx=0;
        for(int i=0;i<n;i++)
        {
           
            for(int j=i+1;j<n;j++)
            {
                if(colors[i]!=colors[j])
                {
                  maxx=Math.max(maxx,Math.abs(i-j));
                  
                }
            }
        }
        return maxx;
    }
}