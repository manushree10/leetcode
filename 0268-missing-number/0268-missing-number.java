class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;
        int n1=0;
        for(int num:nums)
        {
            n1+=num;
        }
        return sum-n1;
    }
}