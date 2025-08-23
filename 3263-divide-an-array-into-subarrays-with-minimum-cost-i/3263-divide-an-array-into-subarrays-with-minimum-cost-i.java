class Solution {
    public int minimumCost(int[] nums) {
        // int cost = 0; 
        
        // cost += nums[0];
        
        // nums[0] = Integer.MAX_VALUE; 

        // Arrays.sort(nums);

        // cost += nums[0];
        // cost += nums[1];

        // return cost; 
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