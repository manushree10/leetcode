class Solution {
    public int maximumCount(int[] nums) {
        int n=nums.length;
        int beg=0;
        int end=n-1;
        int mid;
        int poscnt=0;
        int negcnt=0;
        while(beg<=end)
        {
          mid=beg+(end-beg)/2;
          if(nums[mid]>0)
          {
            end=mid-1;
          }
          else {
            beg=mid+1;
          }
          
        }
        poscnt=n-beg;

        beg=0;
        end=n-1;
        while(beg<=end)
        {
          mid=beg+(end-beg)/2;
          if(nums[mid]<0)
          {
            beg=mid+1;
          }
          else {
            end=mid-1;
          }
          
        }
        negcnt=end+1;
        return Math.max(poscnt,negcnt);
    }
}