class Solution {
    public int[] findColumnWidth(int[][] grid) {
        
        int[] res=new int[grid[0].length];
        for(int i=0;i<grid[0].length;i++)
        {
            int maxx=-1;
            for(int j=0;j<grid.length;j++)
            {
                int len=(grid[j][i]+"").length();
              maxx=Math.max(maxx,len);
            }
            res[i]=maxx;
        }
        return res;
    }
}