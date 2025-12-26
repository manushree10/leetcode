class Solution {
    public int longestOnes(int[] nums, int k) {
        int i=0,j=0;
        int maxx=0;
        int zcnt=0;
        int n=nums.length;
        for(j=0;j<n;j++)
        {
            if(nums[j]==0)
            {
                zcnt++;
            }
            while(zcnt>k)
            {
                if(nums[i]==0)
                {
                    zcnt--;
                    
                }
                i++;
            }
            maxx=Math.max(maxx,j-i+1);
        }
        return maxx;
    }
}