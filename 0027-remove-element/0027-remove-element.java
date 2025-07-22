class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        int cnt=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=val)
            {
               nums[cnt]=nums[i];
               cnt++;
            }
        }
        return cnt;
    }
}