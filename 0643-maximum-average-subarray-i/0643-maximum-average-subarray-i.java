class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        for(int j=0;j<k;j++)
        {
            sum+=nums[j];
        }
       
        double maxx=sum;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
               
             maxx=Math.max(maxx,sum);
        }
        return maxx/k;
    }
}