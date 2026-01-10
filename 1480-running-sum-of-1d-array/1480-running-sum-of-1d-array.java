class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        res[0]=nums[0];
        int sum=0;
        int idx=0;
        for(int i=1;i<=n;i++)
        {
           sum+=nums[i-1];
           res[idx]=sum;
           idx++;
        }
        return res;
    }
}