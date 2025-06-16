class Solution {
    public int maximumDifference(int[] nums) {
        int i,j;
        int diff=0;
        int n=nums.length;
        int maxv=0;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                 if(nums[i]<nums[j])
                {
                   diff=nums[j]-nums[i];
                   maxv=Math.max(maxv,diff);
                }
                
            }
        }
        

        return (maxv==0)?-1:maxv;
    }
}