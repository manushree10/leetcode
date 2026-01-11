class Solution {
    public int pivotIndex(int[] nums) {
        int tot=0;
        int left=0;
      for(int num:nums)
      {
         tot+=num;
      }
      for(int i=0;i<nums.length;i++)
      {
          int right=tot-left-nums[i];
          if(right==left)
          {
             return i;
          }
          left+=nums[i];
      }
      return -1;
    }
}