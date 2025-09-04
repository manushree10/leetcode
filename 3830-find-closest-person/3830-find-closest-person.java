class Solution {
    public int findClosest(int x, int y, int z) {
        int res1=0;
        int res2=0;
        int x1=1;
        int y1=2;
            res1=Math.abs(x-z);
             res2=Math.abs(y-z);
        
        if(res1<res2)
        {
            return x1;
        }
         if(res1>res2)
        {
            return y1;
        }
        return 0;
    }
}