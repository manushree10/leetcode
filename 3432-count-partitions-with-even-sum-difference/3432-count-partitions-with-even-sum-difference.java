class Solution {
    public int countPartitions(int[] nums) {
        int tsum=0;
        int suml=0;
        int sr=0;
        int cnt=0;
        for(int i=0;i<nums.length;i++)
        {
              tsum+=nums[i];
        }
        for(int i=0;i<nums.length-1;i++)
        {
            sr=tsum-nums[i];
            suml=tsum-sr;
            if(suml%2==sr%2)
            {
                cnt++;
            }
        }
        return cnt;
    }
}