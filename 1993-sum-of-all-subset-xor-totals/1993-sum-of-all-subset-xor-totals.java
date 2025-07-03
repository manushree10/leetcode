class Solution {
    public int subsetXORSum(int[] nums) {
        int cnt=0;
        for(int num:nums)
        {
            cnt|=num;
            
        }
      return cnt*(1<<(nums.length-1));  
    }
}