class Solution {
    public int trap(int[] height) {
        if(height.length==0)
        {
            return 0;
        }
        int l=0;
        int r=height.length-1;
        int maxl=0;
        int maxr=0;
        int trapw=0;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>=maxl)
                {
                    maxl=height[l];
                }
                else
                {
                    trapw+=maxl-height[l];
                }
                l++;
            }
            else
            {
                if(height[r]>=maxr)
                {
                    maxr=height[r];
                }
                else
                {
                    trapw+=maxr-height[r];
                }
                r--;
            }
        }
        return trapw;

    }
}