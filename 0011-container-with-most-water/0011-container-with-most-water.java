class Solution {
    public int maxArea(int[] height) {
        // int area=0;
        // int area1=Integer.MIN_VALUE;
        // int n=height.length;
        
        // for(int i=0;i<n;i++)
        // {
        //     for(int j=i+1;j<n;j++)
        //     {
        //        area=(j-i)*Math.min(height[i],height[j]);
        //        area1=Math.max(area1,area);
        //     }
        // }
        // return area1;

         int l=0;
         int r=height.length-1;
         int area=0;
         int maxx=Integer.MIN_VALUE;
         while(l<r)
         {
            area=(r-l)*Math.min(height[l],height[r]);
            maxx=Math.max(maxx,area);
           if(height[l]<height[r]){
            l++;
           }
           else  {
            r--;
         }
         }
        return maxx;
    }
}