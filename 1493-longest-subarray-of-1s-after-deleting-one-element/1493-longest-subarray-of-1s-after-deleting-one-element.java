class Solution {
    public int longestSubarray(int[] nums) {
        int n=nums.length;
        int i=0,j=0;
        int zcnt=0;
        int res=0;
        while(j<n)
        {
            if(nums[j]==0)
            {
                zcnt++;
            }
            while(zcnt>1)
            {
                if(nums[i]==0)
                {
                    zcnt--;
                }
                i++;
            }
            res=Math.max(res,j-i);
            j++;
        }
        return res;

        // int l=0;
        // int zero=0;
        // int res=0;
        // for(int r=0;r<nums.length;r++)
        // {
        //     if(nums[r]==0)
        //     {
        //         zero++;
        //     }
        //     while(zero>1)
        //     {
        //         if(nums[l]==0)
        //         {
        //             zero--;
        //         }
        //         l++;
        //     }
        //     res=Math.max(res,r-l);
        // }
        // return res;
    }
}