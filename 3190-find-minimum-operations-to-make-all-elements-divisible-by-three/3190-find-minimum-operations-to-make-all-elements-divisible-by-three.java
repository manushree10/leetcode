class Solution {
    public int minimumOperations(int[] nums) {
        int n=nums.length;
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]%3!=0)
            {
                res++;
            }
        }
        return res;
    }
}