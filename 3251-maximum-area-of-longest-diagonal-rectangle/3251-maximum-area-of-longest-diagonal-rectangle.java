class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m=dimensions.length;
        int maxdiag=0;
        int maxx=0;
        for(int i=0;i<m;i++)
        {
            int l=dimensions[i][0];
            int w=dimensions[i][1];
            int curdiag=l*l+w*w;

            if(curdiag>maxdiag || (curdiag==maxdiag && l*w >maxx))
            {
                maxdiag=curdiag;
                maxx=l*w;
            }
        }
        return maxx;
    }
}