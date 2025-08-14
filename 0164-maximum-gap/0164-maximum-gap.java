class Solution {
    public int maximumGap(int[] nums) {
        int n=nums.length;
        if(n<2)
        {
            return 0;
        }
        Arrays.sort(nums);
        int maxx=0;
        int res=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)

            {
                res=Math.abs(nums[i]-nums[j]);
                break;
                
            }
             maxx=Math.max(maxx,res);
        }
        return maxx;
    }
}