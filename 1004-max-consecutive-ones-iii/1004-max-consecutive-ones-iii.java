class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int i=0,j=0;
        int zcnt=0;
        int res=0;
        
        while(j<n)
        {
          if(nums[j]==0)
          {
            zcnt++;
          }
          while(zcnt>k)
          {
            if(nums[i]==0){
            zcnt--;
            }
            i++;
          }
          res=Math.max(res,j-i+1);
          j++;
        }
        return res;
    }
}