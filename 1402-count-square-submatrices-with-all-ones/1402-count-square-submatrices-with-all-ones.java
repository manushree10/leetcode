class Solution {
    public int countSquares(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;
        int[][] dp=new int[r][c];
        int res=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(matrix[i][j]==1)
                {
                    if(i==0||j==0)
                    {
                        dp[i][j]=1;
                    }
                    else{
        dp[i][j]=1 + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
                    }
                    res+=dp[i][j];
                }
            }
        }
        return res;
    }
}