class Solution {
    public int[] findErrorNums(int[] nums) {
        int dup=-1;
        int miss=-1;
        int n=nums.length;
        for(int i=1;i<=n;i++)
        {
           int  cnt=0;
            for(int j=0;j<n;j++)
            {
               if(nums[j]==i){
               cnt++;
               }
            }
            if(cnt>=2)
            {
                dup=i;
            }
            else if(cnt==0)
            {
                miss=i;
            }
        }
        return new int[] {dup,miss};
    }
}