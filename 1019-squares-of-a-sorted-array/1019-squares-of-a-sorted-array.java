class Solution {
    public int[] sortedSquares(int[] nums) {
        // int n=nums.length;
        // int[] res=new int[n];
        // for(int i=0;i<n;i++)
        // {
        //      res[i]=nums[i]*nums[i];
            

        // }
        // Arrays.sort(res);
        // return res;

        int l=0;
         int r=nums.length-1;
         int[] res=new int[nums.length];
         int pos=nums.length-1;
         while(l<=r)
         {
            int lsq=nums[l]*nums[l];
            int rsq=nums[r]*nums[r];
            if(lsq>rsq)
            {
                res[pos]=lsq;
                l++;
            }
            else
            {
                res[pos]=rsq;
                r--;
            }
            pos--;
         }
         return res;
    }
}