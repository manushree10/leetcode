class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       
        int l=0;
        int sum=0;
        int minn=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++)
        {
            sum+=nums[r];
            while(sum>=target)
            {
                minn=Math.min(minn,r-l+1);
                sum-=nums[l];
                l++;
            }
            
        }
        if(minn==Integer.MAX_VALUE)
        {
            return 0;
        }
        return minn;
    }
}