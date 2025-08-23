class Solution {
    public int minimumCost(int[] nums) {
        // int n=nums.length;
        // int sum=nums[0];
        // Arrays.sort(nums,1,n);
        // sum=sum+nums[1]+nums[2];

        // return sum;
        int sum=nums[0],min1=Integer.MAX_VALUE,min2=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]<min1)
            {
                min2=min1;
                min1=nums[i];
            }
            else if(nums[i]<min2)
            {
                min2=nums[i];
            }
        }
        return sum+min1+min2;
    }
}