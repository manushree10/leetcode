class Solution {
    public int earliestTime(int[][] tasks) {
        int n=tasks.length;
        int m=tasks[0].length;
        
        int maxx=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            int sum=0;
            for(int j=0;j<m;j++)
            {
                sum=sum+tasks[i][j]; 
                 
            }
            maxx=Math.min(maxx,sum);

        }
        
        return maxx;
    }
}