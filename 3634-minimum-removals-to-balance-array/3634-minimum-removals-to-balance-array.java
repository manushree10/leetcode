class Solution {
    public int minRemoval(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int max=0;
        int i=0;
        for(int j=0;j<n;j++)
        {
            while((long)nums[j]>(long)nums[i]*k)
            {
               i++;
            }
            max=Math.max(max,j-i+1);
        }
       return nums.length-max;
    }
}