class Solution {
    public double findMaxAverage(int[] nums, int k) {
        
        double sum=0;
        for(int j=0;j<k;j++)
        {
            sum+=nums[j];
        }
        double avg=sum/k;
        double maxx=avg;
        for(int i=k;i<nums.length;i++)
        {
            sum+=nums[i]-nums[i-k];
               double db=sum/k;
             maxx=Math.max(maxx,db);
        }
        return maxx;
    }
}