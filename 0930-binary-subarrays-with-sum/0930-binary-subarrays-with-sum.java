class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
         return match(nums,goal)-match(nums,goal-1);
    }
    private int match(int nums[] ,int goal){
        if (goal < 0) return 0;
       int i=0,j=0;
       int sum=0;
       int n=nums.length;
       int res=0;
       for(j=0;j<n;j++)
       {
         sum+=nums[j];
         while(sum>goal)
         {
            sum-=nums[i];
            i++;
         }
         res+=j-i+1;
       } 
       return res;
    }
}
