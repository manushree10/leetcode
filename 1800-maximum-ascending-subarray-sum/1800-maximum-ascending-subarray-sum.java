class Solution {
    public int maxAscendingSum(int[] nums) {
        int sum=nums[0];
       int n=nums.length;
       int cur=nums[0];
       for(int i=1;i<n;i++)
       {
           if(nums[i]>nums[i-1])
           {
            cur=cur+nums[i];
            sum=Math.max(sum,cur);
           }
           else
           cur=nums[i];
       }
       return sum;
    }
}