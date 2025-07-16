class Solution {
    public int maxSubArray(int[] nums) {
       // int n=nums.length;
        int res=nums[0];
        int tot=0;
        for(int num:nums)
        {
            if(tot<0)
            {
                tot=0;
            }
            tot+=num;
            res=Math.max(res,tot);
        }
       
        return res;
    }
}