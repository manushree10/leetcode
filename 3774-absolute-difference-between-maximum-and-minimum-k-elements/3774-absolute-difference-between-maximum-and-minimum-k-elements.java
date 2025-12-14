class Solution {
    public int absDifference(int[] nums, int k) {
        int n=nums.length;
        int maxx=0;
        int minn=0;
        Arrays.sort(nums);
        if(nums.length<=1)
        {
            return 0;
        }
        for(int i=0;i<k;i++)
        {
         minn+=nums[i];   
       
            maxx+=nums[n-1-i];
        }
        return Math.abs(maxx-minn);
    }
}