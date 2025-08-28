class Solution {
    public int dominantIndex(int[] nums) {
        int n=nums.length;
        int maxind=0;
        for(int i=1;i<n;i++)
        {
            if(nums[maxind]<nums[i])
            {
                maxind=i;
            }
        }
        for(int i=0;i<n;i++)
        {
            if(maxind!=i && nums[maxind]<nums[i]*2)
            {
                return -1;
            }
        }
    return maxind;
    }
}