class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        
        //int sum=0;
        for(int i=nums.length-1;i>=2;i--)
        {
            if(nums[i - 1] + nums[i - 2] > nums[i])
            {
                return nums[i] + nums[i - 1] + nums[i-2];
            }
        }
        return 0;
        //int larp=0;
        //int n=nums.length;
        //for(int i=0;i<n-2;i++)
        //{
        //     for(int j=i+1;j<n-1;j++)
        //     {
        //         for(int k=j+1;k<n;k++)
        //         {
        //         if(nums[i]+nums[j]>nums[k])
        //         {
        //             int curp= nums[i]+nums[j]+nums[k];
        //             if(curp>larp)
        //             {
        //                 larp=curp;
        //             }
        //         }
        //     }
        // }
        // }
        // return larp;
    }
}