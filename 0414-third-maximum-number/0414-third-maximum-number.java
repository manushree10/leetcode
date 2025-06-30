class Solution {
    public int thirdMax(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int larg=nums[n-1];
        int cnt=1;
        for(int i=n-2;i>=0;i--)
        {
            if(nums[i]!=larg)
            {
                cnt++;
                larg=nums[i];
            }
            if(cnt==3)
            {
                return larg;
            }
        }
        return nums[n-1];
    }
}