class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        Arrays.sort(nums);
        int min=nums[0];
        int res=0;
        for(int s:nums)
        {
            res+=s-min;
        }
        return res;
    }
}