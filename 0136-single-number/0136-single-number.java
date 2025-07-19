class Solution {
    public int singleNumber(int[] nums) {
        // int n=0;
        // for(int num:nums)
        // {
        //     n^=num;
        // }
        // return n;
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            cnt=0;
            for(int j=0;j<n;j++)
            {
                if(nums[i]==nums[j])
                {
                    cnt++;
                }
            }
                if(cnt==1)
                {
                    return nums[i];
                }
            
        }
        return -1;
    }   
}