class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=n*(n+1)/2;

        int actualnum=0;
        for(int num:nums )
        {
          actualnum+=num;
        }
        return sum-actualnum;
    }
}