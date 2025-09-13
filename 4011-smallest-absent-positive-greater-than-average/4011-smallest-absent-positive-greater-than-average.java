class Solution {
    public int smallestAbsent(int[] nums) {
        int avg=0;
        int sum=0;
        int n=nums.length;
        Arrays.sort(nums);
        for(int num:nums)
        {
            sum+=num;
        }
        avg=sum/n;
        int find=avg>=0?avg+1:1;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==find)
            {
                find++;
            }
        }
        return find;
    }
}